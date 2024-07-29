package com.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recipe.entities.Recipe;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe, Long> {

}
