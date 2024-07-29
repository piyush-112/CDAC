package com.hotel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.hotel.entities.Type;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class RoomDto {

	@JsonProperty(access = Access.READ_ONLY)
	private Long rid;
	
	private int rnumber;
	private Type type;
	private double price;
	private String availability;
	
	
	
}
