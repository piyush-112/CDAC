package com.blogs.service;

import java.time.LocalDateTime;
import java.util.List;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDTO;

public interface CommentService {
	ApiResponse addComment(CommentDTO dto);

	List<CommentDTO> getCommentsByPostTitle(String title);

	List<CommentDTO> getCommentsAfterUpdateTime(LocalDateTime updateTime);
}
