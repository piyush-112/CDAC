package com.recipe.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.custom_exception.ResourceNotFoundException;
import com.recipe.dto.ApiResponse;
import com.recipe.dto.RecipeDto;
import com.recipe.entities.Recipe;
import com.recipe.entities.User;
import com.recipe.repository.RecipeRepo;
import com.recipe.repository.UserRepo;


@Service
@Transactional
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	private RecipeRepo recipeRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private UserRepo userrepo;
	
	
	@Override
	public RecipeDto getDetails(Long recipeId) {
		
		 Recipe recipe=recipeRepo.findById(recipeId).orElseThrow(()->new ResourceNotFoundException("Id is not Found"));
		 
		 return mapper.map(recipe, RecipeDto.class);
	}


	@Override
	public ApiResponse addRecipe(RecipeDto dto) {
		
		User user=userrepo.findById(dto.getUserId()).orElseThrow(()->new ResourceNotFoundException("Already Present"));
		
		Recipe recipe=mapper.map(dto, Recipe.class);
		
		recipe.setUser(user);
		
		recipeRepo.save(recipe);
		
		return new ApiResponse("Successfully Added");
	}


	@Override
	public ApiResponse updateRecipe(Long recipeId,RecipeDto dto) {
		
		recipeRepo.findById(recipeId).orElseThrow(()->new ResourceNotFoundException("Record is Not their"));
		
		recipeRepo.save(mapper.map(dto,Recipe.class));
		
		return new ApiResponse("Update Successfully");
		
		
	}


	@Override
	public ApiResponse deleteRecipe(Long recipeId) {
		// TODO Auto-generated method stub
		
		Recipe recipe=recipeRepo.findById(recipeId).orElseThrow(()->new ResourceNotFoundException("Recipe is not Found"));
		
		recipeRepo.delete(recipe);
		
		return new ApiResponse("Delete Successfully");
	}

}
