package com.blogs.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDTO;
import com.blogs.service.CommentService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	/*
	 * URL - http://host:port/comments
	Method - POST
	req - comment dto 
	resp - ApiResp with mesg
	 */
	@PostMapping
	@Operation(description = "Add a comment")
	public ResponseEntity<?> addComment(@RequestBody CommentDTO dto)
	{
		System.out.println("in add comment "+dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(commentService.addComment(dto));
		
	}
	/*
	 * URL - http://host:port/comments
	Method - GET
	req - blog post title 
	resp - List of Comments (dto)
	 */
	@GetMapping("/{title}")
	@Operation(description = "Get all comments for given post title")
	public ResponseEntity<?> getCommentsByPostTitle(@PathVariable String title)
	{
		System.out.println("in get comments by post title "+title);
		return ResponseEntity.ok(commentService.getCommentsByPostTitle(title));
	}
	/*
	 * URL - http://host:port/comments/update_time
	Method - GET
	req - comments update time
	resp - List of Comments (dto)
	 */
	@GetMapping("/update_time/{updateTime}")
	@Operation(description = "Get all comments updated after given update time")
	public ResponseEntity<?> getCommentsByUpdateTime(@PathVariable 
			@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime updateTime)
	{
		System.out.println("in get comments by update tm "+updateTime);
		return ResponseEntity.ok(commentService.getCommentsAfterUpdateTime(updateTime));
	}
}
