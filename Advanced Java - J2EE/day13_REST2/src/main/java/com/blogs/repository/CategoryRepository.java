package com.blogs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
//add a finder 
	/*
	 * //add a method get list of categories with desc having a keyword //
	 * 
	 */
	List<Category> findByDescriptionContaining(String keyword);
}
