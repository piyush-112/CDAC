package com.admission.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@NoArgsConstructor
@ToString
public class StudentDto extends BaseEntityDto {

	//first name , last name , email , course id,score obtained
	@NotEmpty(message = "kdfskjdnsk")
	private String name;
	
	@NotEmpty(message = "Password must be supplied!!!")
	private String last_name;
	
	@NotEmpty
	@Email(message = "Invalid email format")
	private String email;
	
	private int Score;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long courseid;

	
	
	
	
}
