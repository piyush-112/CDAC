package com.admission.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "students")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Student extends BaseEntity {

	//first name , last name , email , course id,score obtained
	private String name;
	
	private String last_name;
	
	private String email;
	
	private int Score;
	
	@ManyToOne
	@JoinColumn(name="Course_id",nullable = false)
	private Course course;

	public Student(String name, String last_name, String email, Course course) {
		super();
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		
	}
	
	
	
}
