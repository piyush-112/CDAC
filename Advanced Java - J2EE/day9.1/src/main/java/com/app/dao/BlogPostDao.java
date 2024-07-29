package com.app.dao;

import com.app.entities.BlogPost;

public interface BlogPostDao {

	String createNewBlog(BlogPost post, Long categoryId, Long authorId);

	String removeBlog(Long catId, Long blogId);

}
