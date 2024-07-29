package com.recipe.dto;

import java.time.LocalDate;


public class ApiResponse {

	
	private String msg;
	private LocalDate date;
	
	public ApiResponse(String msg) {
		super();
		this.msg = msg;
		this.date=LocalDate.now();
	}
	
	
}
