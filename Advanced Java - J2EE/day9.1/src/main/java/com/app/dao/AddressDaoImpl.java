package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Address;
import com.app.entities.User;

public class AddressDaoImpl implements AddressDao {

	@Override
	public String assignUserAddress(Long userId, Address newAdr) {
		String mesg="assigning adr failed !";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			//get user from the id
			User user=session.get(User.class, userId);
			if(user != null)
			{
				user.setMyAddress(newAdr);
			//	session.persist(newAdr); no need of persisting separately - thanks to cascade !
				mesg="assigned user address";
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

}
