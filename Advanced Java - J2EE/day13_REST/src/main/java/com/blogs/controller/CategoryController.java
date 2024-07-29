package com.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dtos.ApiResponse;
import com.blogs.entities.Category;
import com.blogs.service.CategoryService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	// depcy
	@Autowired
	private CategoryService categoryService;

	public CategoryController() {
		System.out.println("in ctor " + getClass());
	}

	/*
	 * desc - get all categories URL - http://host:port/categories Method - GET
	 * payload - None Resp - JSON represention of List<Category>
	 */
	@GetMapping
	public ResponseEntity<?> getCategories() {
		System.out.println("in get categories");
		return ResponseEntity.ok(categoryService.getAllCategories());
	}

	/*
	 * Desc - add new category URL - http://host:port/categories Method - POST
	 * payload - JSON represention of a new category(nm,desc) Resp - Saved Category
	 * (along with id update create nm,desc)
	 */
	@PostMapping
	public ResponseEntity<?> addNewCategory(@RequestBody Category category) {
		System.out.println("in add category " + category);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.addNewCategory(category));
	}

	/*
	 * Desc - Get Category details for specified id(via URI var) URL -
	 * http://host:port/categories/{categoryId} Method - GET o/p - success - SC 200
	 * + category details error - SC 404 , err mesg (DTO -- ApiResponse - error
	 * mesg)
	 */
	@GetMapping("/{categoryId}")
	/*
	 * To describe the REST operation for the documentation purpose, use OAS(Open
	 * API Spec) / Swagger annotation
	 */
	@Operation(description = "Get Category details by id ")
	public ResponseEntity<?> getCategoryDetails(@PathVariable Long categoryId) {
		System.out.println("in get category " + categoryId);
		try {
			return ResponseEntity.status(HttpStatus.OK).body(categoryService.getCategoryById(categoryId));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage()));
		}
	}

	/*
	 * Desc - Update Category details for specified id(via URI var) URL -
	 * http://host:port/categories/{categoryId} Method - PUT payload - updated
	 * category details o/p - success - SC 200 + category details error - SC 404 ,
	 * err mesg (DTO -- ApiResponse - error mesg)
	 */
	@PutMapping("/{id}")
	@Operation(description = "Update Category details")
	public ResponseEntity<?> updateCategory(@PathVariable Long id, @RequestBody Category category) {
		System.out.println("in update " + id + " " + category);
		return ResponseEntity.status(HttpStatus.OK).body(categoryService.updateCategoryDetails(id, category));

	}

	/*
	 * Desc - Delete Category details for specified id(via URI var) URL -
	 * http://host:port/categories/{categoryId} Method - DELETE o/p - success - SC
	 * 200 failed - SC 404 , error mesg +
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
		System.out.println("in delete " + id);
		return ResponseEntity.ok(
				categoryService.deleteCategoryDetails(id));
	}

}
