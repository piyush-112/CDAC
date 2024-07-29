package com.blogs.service;

import java.util.List;

import com.blogs.dtos.ApiResponse;
import com.blogs.dtos.CategoryDTO;
import com.blogs.entities.Category;

public interface CategoryService {
	List<CategoryDTO> getAllCategories();
	CategoryDTO addNewCategory(CategoryDTO category);
	CategoryDTO getCategoryById(Long id);
	ApiResponse updateCategoryDetails(Long id, Category category);
	ApiResponse deleteCategoryDetails(Long id);
}
