package com.blogs.controller;

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

import com.blogs.dto.CategoryDTO;
import com.blogs.entities.Category;
import com.blogs.service.CategoryService;

import io.swagger.v3.oas.annotations.Operation;

/*
 * @Controller at class level + @ResponseBody implicitly added 
 * on ret types of req handling methods(@RequestMapping 
 * | @GetMapping|@PostMapping...) 
 */
@RestController
@RequestMapping("/categories") // optional BUT reco
public class CategoryController {
	// depcy
	@Autowired // byType
	private CategoryService categoryService;

	

	/*
	 * Desc  Get All Categories
	 *  Design end point of REST API 
	 *  URL -http://host:port/categories 
	 *  Method - GET 
	 *  Payload(request data) - NONE 
	 *  Resp - List of dtos
	 */
	@GetMapping
	@Operation(description ="Get All Categories" )
	public ResponseEntity<?> listAllCategories() {
		System.out.println("in list all categories");
		return ResponseEntity.
				ok(categoryService.getAllCategories());
	}

	/*
	 * Design end point of REST API for adding new category(Create) 
	 * URL -  http://host:port/categories 
	 * Method - POST 
	 * Payload(request data) - category dto(name n desc) 
	 * Resp  -- Category dto (with generated id)
	 */
	@PostMapping
	public ResponseEntity<?> addNewCategory(@RequestBody CategoryDTO category) {
		System.out.println("in add new category " + category);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(categoryService.addNewCategory(category));
	}

	/*
	 * Design end point of REST API for deleting existing category(Delete) URL
	 * -http://host:port/categories/{categoryId} (URI template variable |path
	 * variable) Method - DELETE Payload(request data) - none Resp - : @ResponseBody
	 * -- plain string message
	 * 
	 */
	@DeleteMapping("/{categoryId}")
	// @PathVariable - method arg level annotation , to bind
	// incoming path var to the method arg
	public ResponseEntity<?> deleteCategoryDetails(@PathVariable Long categoryId) {
		System.out.println("in del category " + categoryId);
		return ResponseEntity.ok(
				categoryService.deleteCategoryDetails(categoryId));
	}

	/*
	 * Design end point of REST API for getting existing category(GET) URL -
	 * http://host:port/categories/{categoryId} (URI template variable |path
	 * variable) Method - GET Payload(request data) - none Resp - : @ResponseBody --
	 * Category
	 * 
	 */
	
	@GetMapping("/{catId}")
	public ResponseEntity<?> getCategoryDetails(@PathVariable Long catId) {
		System.out.println("in get category by " + catId);
		return ResponseEntity.ok(categoryService.getCategoryDetails(catId));
	}
	
	@GetMapping("{catId}/posts")
	public ResponseEntity<?> listCategoryAndPosts(@PathVariable Long catId) {
		System.out.println("in list category n it's posts");
		return ResponseEntity.ok(categoryService.getCategoryAndPosts(catId));
	}

	/*
	 * Desc - Update Category details for specified id(via URI var) 
	 * URL - http://host:port/categories/{categoryId} 
	 * Method - PUT 
	 * payload - updated category details 
	 * o/p - success - SC 200 + category details error - SC 404 ,
	 * err mesg (DTO -- ApiResponse - error mesg)
	 */
	@PutMapping("/{id}")
	@Operation(description = "Update Category details")
	public ResponseEntity<?> updateCategory(@PathVariable Long id, @RequestBody Category category) {
		System.out.println("in update " + id + " " + category);
		return ResponseEntity.status(HttpStatus.OK).body(categoryService.updateCategoryDetails(id, category));

	}


}
