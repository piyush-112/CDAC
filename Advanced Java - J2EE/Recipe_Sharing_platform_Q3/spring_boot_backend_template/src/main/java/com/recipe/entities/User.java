package com.recipe.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User extends BaseEntity {
	
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}
	
	
	
}
