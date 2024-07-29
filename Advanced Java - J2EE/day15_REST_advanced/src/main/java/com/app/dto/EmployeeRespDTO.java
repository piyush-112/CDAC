package com.app.dto;

import java.time.LocalDate;

import com.app.entities.EmploymentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class EmployeeRespDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate joinDate;
	private EmploymentType empType;
	private double salary;
	//how to skip a password during ser n allow only for de-ser ?
//	@JsonProperty(value="pwd",access=Access.WRITE_ONLY)
//	private String password;

}
