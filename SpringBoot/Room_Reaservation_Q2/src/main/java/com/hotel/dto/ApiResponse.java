package com.hotel.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ApiResponse {

	private String msg;
	private LocalDateTime timeStamp;
	public ApiResponse(String msg) {
		super();
		this.msg = msg;
		this.timeStamp = LocalDateTime.now();
	}
	
	
}
