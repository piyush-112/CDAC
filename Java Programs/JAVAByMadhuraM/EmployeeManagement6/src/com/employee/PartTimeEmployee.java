package com.employee;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee 
{
	private double hourlyPayment;

	public PartTimeEmployee(String name, LocalDate dateOfJoining, String phoneNumber, String adharNumber,double hourlyPayment) {
		super(name, dateOfJoining, phoneNumber, adharNumber);
		this.hourlyPayment = hourlyPayment;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee "+ super.toString() + " hourlyPayment: " + hourlyPayment;
	}

	public double getHourlyPayment() {
		return hourlyPayment;
	}

	public void setHourlyPayment(double hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}
	
	

}
