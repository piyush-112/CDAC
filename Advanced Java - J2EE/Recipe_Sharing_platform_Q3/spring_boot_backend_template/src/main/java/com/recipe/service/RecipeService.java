package com.recipe.service;

import com.recipe.dto.ApiResponse;
import com.recipe.dto.RecipeDto;

public interface RecipeService {

	RecipeDto getDetails(Long recipeId);

	ApiResponse addRecipe(RecipeDto dto);

	ApiResponse updateRecipe(Long recipeId,RecipeDto dto);

	ApiResponse deleteRecipe(Long recipeId);
}
