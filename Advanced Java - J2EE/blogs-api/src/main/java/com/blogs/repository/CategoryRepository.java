package com.blogs.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blogs.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	List<Category> findByDescriptionContaining(String keyword);

	@Query("select c from Category c left join fetch c.posts where c.id=:id")
	Optional<Category> getCategoryAndPosts(Long id);
}
