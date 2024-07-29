package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Role;
import com.app.entities.User;

public class UserDaoImpl implements UserDao {

	@Override
	public String registerUser(User user) {
		// user - TRANSIENT -only exists in java heap , not in L1 cache n DB
		String mesg = "User reg failed !!!!!!!";
		// 1. Get session from SessionFactory (using getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// Serializable userId = session.save(user);
			session.persist(user);
			// user - PERSISTENT - exists in L1 cache n not yet in DB
			// 3. success
			tx.commit();// DML - insert
			/*
			 * Upon commit -- session.flush() -- hibernate performs auto dirty checking to
			 * sync up state of the L1 cache with that of DB In case of new entitiy/entities
			 * - insert in case existing entities but change in the state - update in case
			 * of removed entities - delete query automatically. Since using
			 * getCurrentSession - hibernate calls session.close() -> L1 cache is destroyed
			 * n pooled out db cn rets to DBCP
			 */
			mesg = "user registered successfully with ID=" + user.getId();
		} catch (RuntimeException e) {
			// 4. failure
			if (tx != null)
				tx.rollback();
			/*
			 * Hibernate simply calls -- session.close() - L1 cache is destroyed n pooled
			 * out db cn rets to DBCP
			 * 
			 */
			// re throw the same exc to the caller
			throw e;
		}
		// user - DETACHED
		return mesg;
	}

	@Override
	public User getUserDetails(Long userId) {
		User user = null;// user - doesn't exist in the heap!
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.get(User.class, userId);// select query
//			user=session.get(User.class, userId);
//			user=session.get(User.class, userId);
//			user=session.get(User.class, userId);
			// in case of valid id -- user : PERSISTENT
			// invalid id - null
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}
		return user;// user(in case valid id) -- DETACHED
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		String jpql = "select u from User u";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class) // Query<User>
					.getResultList();
			// users - list of PERSISTENT entities
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}
		return users;// users - list of DETACHED entities
	}

	@Override
	public List<User> getUsersByDobAndRole(LocalDate start1, LocalDate end1, Role role1) {
		List<User> users = null;
		String jpql = "select u from User u where u.dob between :start and :end and u.role=:rl";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class).setParameter("start", start1).setParameter("end", end1)
					.setParameter("rl", role1).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}

		return users;
	}

	@Override
	public User signIn(String email, String password) {
		User user = null;
		// 1. get Session from SF
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class).setParameter("em", email).setParameter("pass", password)
					.getSingleResult();// select
			// user : persistent
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}

		return user; // user : detached from L1 cache
	}

	@Override
	public List<String> getLastNamesByRole(Role role1) {
		List<String> names = null;
		String jpql = "select u.lastName from User u where u.role=:role";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			names = session.createQuery(jpql, String.class).setParameter("role", role1).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}
		return names;
	}

	@Override
	public List<User> getNamesAndDobByRole(Role role) {
		List<User> users = null;
		String jpql = "select new com.app.entities.User(firstName,lastName,dob) from User u where u.role=:role";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class).setParameter("role", role).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}

		return users;
	}

	@Override
	public String changePassword(String email, String pwd, String newPwd) {
		String mesg = "passwrod updation failed !!!!!";
		User user = null;
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class).setParameter("em", email).setParameter("pass", pwd)
					.getSingleResult();// select
			// user - persistent
			user.setPassword(newPwd);// updating state of PERSISTENT entity
			// session.evict(user);//user - DETACHED
			tx.commit();
			mesg = "password updated";
			/*
			 * Hibernate perform auto dirty chking upon commit session.flush --> DML :
			 * update -> session.close
			 */
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}
		user.setPassword("34567900");// updating state of DETACHED entity --DOES NOT result in to any changes in DB
		return mesg;
	}

	@Override
	public String applyDiscount(LocalDate date, double discount) {
		String mesg = "applying discount failed !!!!!!!!!!!";
		String jpql = "update User u set u.regAmount=u.regAmount-:amt where u.dob<:dt";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			int rowCount = session.createQuery(jpql).setParameter("amt", discount).setParameter("dt", date)
					.executeUpdate();
			tx.commit();
			mesg = "Updated recs : " + rowCount;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}

		return mesg;
	}

	@Override
	public String deleteUserDetails(Long userId) {
		String mesg = "deletion failed";
		User user = null;// user - does not exist in the heap
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// get user details (persistent)
			user = session.get(User.class, userId);
			if (user != null) {
				// user : persistent
				session.delete(user);// user : removed
				mesg = "deleted user details";
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		// user : transient
		return mesg;
	}// user : Marked for GC (does not exist !)

	@Override
	public String storeImage(String fileName, Long userId) throws IOException {
		String mesg = "storing image failed";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// 3 get user
			User user = session.get(User.class, userId);
			if (user != null) {
				// user :exists , persistent
				// 4. create file class instance to store the path
				File file = new File(fileName);
				// validate the file
				if (file.isFile() && file.canRead()) {
					user.setImage(FileUtils.readFileToByteArray(file));// modifying state of the persistent entity
					mesg = "image stored...";
				}
			}
			tx.commit();// DML - update
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

	@Override
	public String restoreImage(String fileName, Long userId) throws IOException {
		String mesg = "restoring image failed";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// 3 get user
			User user = session.get(User.class, userId);
			if (user != null) {
				// user :exists , persistent
				// 4. get image of user
				byte[] img = user.getImage();
				if (img != null) {
					// img exists
					FileUtils.writeByteArrayToFile(new File(fileName), img);
					mesg = "img restored";
				}
			}
			tx.commit();// DML - update
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

	
	@Override
	public List<User> getUserNamesByCity(String city1) {
		List<User> users = null;
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return users;
	}

}
