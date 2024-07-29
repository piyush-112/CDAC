package com.blogs.service;

import java.util.List;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.CategoryDTO;
import com.blogs.dto.CategoryPostDetails;
import com.blogs.entities.Category;

public interface CategoryService {
	List<CategoryDTO> getAllCategories();
	CategoryDTO addNewCategory(CategoryDTO category);
	ApiResponse deleteCategoryDetails(Long catId);
	CategoryDTO getCategoryDetails(Long categoryId);
	CategoryPostDetails getCategoryAndPosts(Long categoryId);
	ApiResponse updateCategoryDetails(Long id, Category category);
}
