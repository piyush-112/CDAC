package com.app.dao;

import com.app.entities.*;
import org.hibernate.*;
import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public String createcategory(Category category) {
		// category - TRANSIENT -only exists in java heap , not in L1 cache n DB
				String mesg = "category reg failed !!!!!!!";
				// 1. Get session from SessionFactory (using getCurrentSession)
				Session session = getFactory().getCurrentSession();
				// 2. Begin a Tx
				Transaction tx = session.beginTransaction();
				try {
					Serializable categoryId = session.save(category);
					// category - PERSISTENT - exists in L1 cache n not yet in DB
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
					mesg = "category registered successfully with ID=" + categoryId;
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
				// category - DETACHED
				return mesg;
	}

	@Override
	public List<Category> getAllcategories() {
		List<Category> category = null;
		String jpql = "select c from Category c";
		// 1. get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Tx
		Transaction tx = session.beginTransaction();
		try {
			category = session.createQuery(jpql, Category.class) // Query<User>
					.getResultList();
			// users - list of PERSISTENT entities
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}
		return category;// users - list of DETACHED entities
	}

	@Override
	public Category getCategoryByName(String pname) {
	    Category category = null;
	    // 1. get Session from SF
	    String jpql = "select c from Category c where c.name=:pname";
	    Session session = getFactory().getCurrentSession();
	    // 2. Begin Tx
	    Transaction tx = session.beginTransaction();
	    try {
	        category = (Category) session.createQuery(jpql, Category.class)
	                .setParameter("pname", pname)
	                .getSingleResult();
	        // category : persistent
	        tx.commit();
	    } catch (RuntimeException e) {
	        if (tx != null)
	            tx.rollback();
	        // re throw the same exception to the caller
	        throw e;
	    }

	    return category; // category : detached from L1 cache
	}
}

