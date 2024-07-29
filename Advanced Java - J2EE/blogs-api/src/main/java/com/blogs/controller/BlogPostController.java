package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.BlogPostDTO;
import com.blogs.service.BlogPostService;

@RestController
@RequestMapping("/posts")
public class BlogPostController {
//depcy 
	@Autowired
	private BlogPostService blogPostService;
	/*
	 * For adding a new blog post.
	  i/p - title , desc , contents , category id ,  author id 
     URL - http://host:port/posts ,
     Method - POST
     payload - blog post dto 
     resp - DTO (api resp : mesg)
	 */
	@PostMapping
	public ResponseEntity<?> addNewPost(@RequestBody 
			BlogPostDTO postDTO)
	{
		System.out.println("in add post "+postDTO);
		return 
				ResponseEntity.ok
				(blogPostService.createNewBlog(postDTO));
	}
	/*
	 * For updating contents of  a  blog post.
		i/p - contents 
     URL - http://host:port/posts/{postId} ,
     Method - PUT
     payload - blog post dto (with contents only)
     resp - DTO (api resp : mesg)
	 */
	@PutMapping("/{blogId}")
	public ApiResponse updatePostContents(
			@PathVariable Long blogId,
			@RequestBody BlogPostDTO postDTO)
	{
		System.out.println("in update post "+postDTO);
		return blogPostService.updateBlogContents(blogId,postDTO);
	}
}
