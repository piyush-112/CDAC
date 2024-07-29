package com.blogs.service;

import java.util.List;

import com.blogs.dtos.ApiResponse;
import com.blogs.entities.Category;

public interface CategoryService {
	List<Category> getAllCategories();
	Category addNewCategory(Category category);
	Category getCategoryById(Long id);
	ApiResponse updateCategoryDetails(Long id, Category category);
	ApiResponse deleteCategoryDetails(Long id);
}
