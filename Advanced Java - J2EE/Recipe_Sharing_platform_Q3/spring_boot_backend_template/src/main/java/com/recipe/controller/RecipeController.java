package com.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.dto.RecipeDto;
import com.recipe.service.RecipeService;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	
	@GetMapping("/{recipeId}")
	public ResponseEntity<?> getDetails(@PathVariable Long recipeId)
	{
		return ResponseEntity.ok(recipeService.getDetails(recipeId));
	}
	
	@PostMapping
	public ResponseEntity<?> addRecipe(@RequestBody RecipeDto dto)
	{
		return ResponseEntity.ok(recipeService.addRecipe(dto));
	}
	
	@PutMapping("/{recipeId}")
	public ResponseEntity<?> updateRecipe(@PathVariable Long recipeId, @RequestBody RecipeDto dto)
	{
		return ResponseEntity.ok(recipeService.updateRecipe(recipeId,dto));
	}
	
	@DeleteMapping("/{recipeId}")
	public ResponseEntity<?> deleteRecipe(@PathVariable Long recipeId)
	{
		return ResponseEntity.ok(recipeService.deleteRecipe(recipeId));
	}
}
