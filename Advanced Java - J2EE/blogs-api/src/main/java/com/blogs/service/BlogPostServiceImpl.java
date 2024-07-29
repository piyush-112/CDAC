package com.blogs.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.ResourceNotFoundException;
import com.blogs.dto.ApiResponse;
import com.blogs.dto.BlogPostDTO;
import com.blogs.entities.BlogPost;
import com.blogs.entities.Category;
import com.blogs.entities.User;
import com.blogs.repository.BlogPostRepository;
import com.blogs.repository.CategoryRepository;
import com.blogs.repository.UserRepository;

@Service
@Transactional
public class BlogPostServiceImpl implements BlogPostService {
	// depcy
	@Autowired
	private BlogPostRepository blogPostRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ApiResponse createNewBlog(BlogPostDTO dto) {
		// 1. get category from category id
		Category category = categoryRepository.findById(dto.getCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid category id !!!!"));
		User blogger = userRepository.findById(dto.getBloggerId())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid blogger id !!!!"));
		// category, blogger : persistent
		// map blog post dto --> entity
		BlogPost blogPost = mapper.map(dto, BlogPost.class);
		// establish E-R
		// post *<--->1 catgeory
		category.addBlogPost(blogPost);
		// blog post *---->1 user
		blogPost.setBlogger(blogger);
		// => success
		return new ApiResponse("new blog post added ");
	}
	/*
	 * In case of success --as def implementor of JPA , in spring boot - Hibernate
	 * spring supplied tx mgr bean -> tx.commit ->
	 * session.flush() --> dirty chking --> state of category is updated 
	 * -> cascaded this change -> blog post -> since it's a new entity
	 * -> inserts a new rec in posts table along with FKs
	 * -> session.close() 
	 * -> L1 cache is destroyed n pooled db cn rets to DBCP
	 * 
	 */

	@Override
	public ApiResponse updateBlogContents(Long blogId, BlogPostDTO postDTO) {
		BlogPost post = blogPostRepository.findById(blogId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid blog post id !!!"));
		//dto -> entity (getter : dto , setter : entity , on the content )
		mapper.map(postDTO, post);
		return new ApiResponse("Updated Blog post");
	}

}
