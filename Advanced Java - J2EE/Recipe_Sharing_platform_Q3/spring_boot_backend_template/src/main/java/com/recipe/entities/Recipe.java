package com.recipe.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="recipes")
@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class Recipe extends BaseEntity {
	
	
	private String title;
	private String description;
	private String ingredients;
	private String instruction;
	private int difficultyLevel;
	private String cuisineType;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private User user;

	public Recipe(String title, String description, String ingredients, String instruction, int difficultyLevel,
			String cuisineType) {
		super();
		this.title = title;
		this.description = description;
		this.ingredients = ingredients;
		this.instruction = instruction;
		this.difficultyLevel = difficultyLevel;
		this.cuisineType = cuisineType;
	}
	
	
	
}
