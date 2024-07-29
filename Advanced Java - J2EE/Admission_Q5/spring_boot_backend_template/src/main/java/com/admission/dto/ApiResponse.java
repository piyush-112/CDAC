package com.admission.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class ApiResponse {

	private String msg;
	private LocalDateTime date;
	public ApiResponse(String msg) {
		super();
		this.msg = msg;
		this.date=LocalDateTime.now();
	}
	
	
	
}
