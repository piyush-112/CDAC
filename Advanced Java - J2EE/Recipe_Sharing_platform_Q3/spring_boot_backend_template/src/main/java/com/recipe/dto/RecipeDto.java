package com.recipe.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class RecipeDto extends BaseEntityDto {
	
	
	private String title;
	private String description;
	private String ingredients;
	private String instruction;
	private int difficultyLevel;
	private String cuisineType;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long userId;

	
	
	
	
}
