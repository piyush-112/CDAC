package com.app.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class JobPostingDto {
	
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	private String title;
	private String companyName;
	private String location;
	private String description;
	private String requirements;
	private double salary;
	private LocalDate date;
}