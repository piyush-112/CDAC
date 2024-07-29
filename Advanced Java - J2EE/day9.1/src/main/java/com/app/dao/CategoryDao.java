package com.app.dao;

import com.app.entities.Category;

public interface CategoryDao {
	String addNewCategory(Category category);

	Category getCategoryDetails(String categoryName);

	Category getCategoryAndPostDetails(String categoryName);

	Category getCategoryDetailsById(Long nextLong);
	Category getCompleteGraph(String categoryName);
}
