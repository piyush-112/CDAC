package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.BlogPost;
import com.app.entities.Category;
import com.app.entities.User;

public class BlogPostDaoImpl implements BlogPostDao {

	@Override
	public String createNewBlog(BlogPost post, Long categoryId, Long authorId) {
		String mesg = "adding new post failed....";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// 1. get category from it's id
			Category cat = session.get(Category.class, categoryId);
			// 2 . get author from it's id
			User author = session.get(User.class, authorId);
			// null checking --if not null
			if (cat != null && author != null) {

				// establish uni dir asso between post --> author
				post.setBlogger(author);// uni asso.
				// a bi dir asso post <--> category
				cat.addBlogPost(post);//bi dir asso				

				// since no cascading yet -- explicitly persist post.
				// session.persist(post);
				mesg = "added new post successfully ";

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

	@Override
	public String removeBlog(Long catId, Long blogId) {
		String mesg = "removing blog failed";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// get category from id
			Category category = session.get(Category.class, catId);
			// get blog from its id
			BlogPost post = session.get(BlogPost.class, blogId);
			// validate
			if (category != null && post != null) {
				// updating state of the persistent entity
				category.removeBlogPost(post);
				mesg = "removed blog";
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return null;
	}

}
