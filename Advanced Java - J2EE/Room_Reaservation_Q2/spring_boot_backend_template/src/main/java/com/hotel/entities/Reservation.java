package com.hotel.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="reservations")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String name;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	private double totalPrice;
	
	@OneToOne
	@JoinColumn(name="rid",nullable = false)
	private Room room;

	public Reservation(String name, LocalDate checkinDate, LocalDate checkoutDate, double totalPrice) {
		super();
		this.name = name;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
		this.totalPrice = totalPrice;
	}
	
	

	
}
