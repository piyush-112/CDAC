package com.app.dto;

import java.time.LocalDate;

import com.app.entities.EmploymentType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddEmployee {
	private Long deptId;
	private String firstName;	
	private String lastName;	
	private String email;	
	private String password;
	private LocalDate joinDate;	
	private EmploymentType empType;
	private double salary;
	
}
