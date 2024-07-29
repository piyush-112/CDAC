package com.app.dao;

import java.util.List;

import com.app.entities.Comment;

public interface CommentDao {
//post new comment
	String postNewComment(Comment newComment, Long commenterId, Long postId);

//list all comments by given blog post title
	List<Comment> getCommentsByPost(String next);
}
