package com.blogs.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.ResourceNotFoundException;
import com.blogs.dto.ApiResponse;
import com.blogs.dto.CategoryDTO;
import com.blogs.dto.CategoryPostDetails;
import com.blogs.entities.Category;
import com.blogs.repository.CategoryRepository;

@Service // spring bean containing B.L
@Transactional // auto tx management
public class CategoryServiceImpl implements CategoryService {
	// depcy - dao layer i/f
	@Autowired
	private CategoryRepository categoryRepository;
	// additional depcy
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CategoryDTO> getAllCategories() {
		return categoryRepository.findAll() // List<Category>
				.stream() // Stream<Category>
				.map(category -> modelMapper.map(category, CategoryDTO.class)) // Stream<dto>
				.collect(Collectors.toList());
	}

	
	@Override
	public CategoryDTO addNewCategory(CategoryDTO dto) {
		Category category = modelMapper.map(dto, Category.class);
		Category category2 = categoryRepository.save(category);
		return modelMapper.map(category2, CategoryDTO.class);

	}

	@Override
	public ApiResponse deleteCategoryDetails(Long catId) {
		String mesg = "category details deleted";
		if (categoryRepository.existsById(catId)) {
			// API of CrudRepo - public void deleteById(ID id)
			categoryRepository.deleteById(catId);

		} else
			mesg = "deleting category details failed : Invalid category ID";
		return new ApiResponse(mesg);
	}

	@Override
	public CategoryDTO getCategoryDetails(Long categoryId) {
		// inherited method - Optional<Catgeory> findById(Long catId)
		Optional<Category> optional = 
				categoryRepository.findById(categoryId);

		return modelMapper.map(optional.orElseThrow(
				() -> new ResourceNotFoundException("Invalid Category ID!!!!")),
				CategoryDTO.class);
	}
	
	@Override
	public CategoryPostDetails getCategoryAndPosts(Long categoryId) {
		Category category = categoryRepository.getCategoryAndPosts(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid category id"));

		return modelMapper.map(category, CategoryPostDetails.class);
	}

	@Override
	public ApiResponse updateCategoryDetails(Long id, Category category) {
		String mesg = "Updation failed!!!!";
		// validate id
		if (categoryRepository.existsById(id)) {
			// category id valid
			categoryRepository.save(category);
			mesg = "Updated category details !";
		} else
			throw new ResourceNotFoundException("Invalid Category ID !!!");
		return new ApiResponse(mesg);
	}

}
