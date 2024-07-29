package com.app.entities;

import javax.persistence.*;

@Entity
@Table(name="catagories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",unique=true,length=50,nullable=false)
	private String name;
	
	@Column(name="description",length=200)
	private String description;
	
	public Category(String name, String descrption) {
		this.name=name;
		this.description=description;
	}

	//Getter And Setter
	public Long getId() {
		return id;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	public Category() {
					
	}
	
	
}
