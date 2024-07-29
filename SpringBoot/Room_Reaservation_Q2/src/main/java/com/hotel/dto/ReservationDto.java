package com.hotel.dto;

import java.time.LocalDate;

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
public class ReservationDto {

	
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	
	private String name;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	@JsonProperty(access = Access.READ_ONLY)
	private double totalPrice;
	
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long rid;

	
	
	

	
}
