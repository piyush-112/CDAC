package com.employee;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee 
{
	private double salary;

	public FullTimeEmployee(String name, LocalDate dateOfJoining, String phoneNumber, String adharNumber,double salary) {
		super(name, dateOfJoining, phoneNumber, adharNumber);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee" + super.toString() + " Salary: "+salary ;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
