package com.hotel.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "rooms")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rid;
	
	private int rnumber;
	private Type type;
	private double price;
	private String availability;
	
	public Room(int rnumber, Type type, double price, String availability) {
		super();
		this.rnumber = rnumber;
		this.type = type;
		this.price = price;
		this.availability = availability;
	}
	
	
	
	
	
}
