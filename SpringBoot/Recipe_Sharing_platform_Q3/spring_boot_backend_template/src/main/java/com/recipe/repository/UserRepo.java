package com.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recipe.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
