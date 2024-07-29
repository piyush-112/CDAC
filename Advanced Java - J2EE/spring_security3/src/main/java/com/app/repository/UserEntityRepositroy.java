package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.UserEntity;

public interface UserEntityRepositroy extends JpaRepository<UserEntity,Long>{
//derived finder 
	Optional<UserEntity> findByEmail(String email);
}
