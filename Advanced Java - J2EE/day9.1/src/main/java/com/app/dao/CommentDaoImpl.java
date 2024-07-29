package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.BlogPost;
import com.app.entities.Comment;
import com.app.entities.User;

public class CommentDaoImpl implements CommentDao {

	@Override
	public String postNewComment(Comment newComment, 
			Long commenterId, Long postId) {
		String mesg = "adding comment failed ....";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. get commenter form the id
			User commenter = session.get(User.class, commenterId);
			// 4. get post
			BlogPost post = session.get(BlogPost.class, postId);
			if (commenter != null && post != null) {
				/*
				 * validate first - a blogger should not be allowed to comment on his/her own
				 * blog post ?
				 * 
				 */
				if (commenter.getId() != post.getBlogger().getId()) {
					// establish uni dir asso
					// comment --> user
					newComment.setCommenter(commenter);
					// comment --> post
					newComment.setPost(post);
					// save the comment
					session.persist(newComment);
					mesg="added new comment !";
				}
			}
			tx.commit();// DML : insert with FKS linked !
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

	@Override
	public List<Comment> getCommentsByPost(String postTitle) {
		List<Comment> comments = null;
		String jpql="select c from Comment c where c.post.title=:title";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			comments=session.createQuery(jpql,Comment.class)
					.setParameter("title", postTitle)
					.getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return comments;
	}

}
