package com.blogs.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.blogs.entities.Category;
import com.blogs.entities.Comment;

@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
class CommentRepositoryTest {
	@Autowired
	private CommentRepository commentRepository;

	
	@Test
	void testFindByUpdationTimeStampGreaterThan() {
		LocalDateTime ts=LocalDateTime.of(2024, 6, 14, 22, 59,32);
		List<Comment> list = commentRepository.findByUpdationTimeStampGreaterThan(ts);
		list.forEach(System.out::println);//NOT at all recommended !
	//	assertEquals(7, list.size());
	}
	

}
