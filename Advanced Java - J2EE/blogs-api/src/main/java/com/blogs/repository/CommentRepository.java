package com.blogs.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	List<Comment> findByPostTitleOrderByRatingDesc(String title);
	List<Comment> findByUpdationTimeStampGreaterThan(LocalDateTime ts);
}
