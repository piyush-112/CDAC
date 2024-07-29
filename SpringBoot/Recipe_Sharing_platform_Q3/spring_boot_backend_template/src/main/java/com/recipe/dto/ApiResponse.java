package com.recipe.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ApiResponse {

	
	private String msg;
	private LocalDate date;
	
	public ApiResponse(String msg) {
		this.msg = msg;
		this.date=LocalDate.now();
	}
	
	
}
