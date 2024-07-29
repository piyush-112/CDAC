package com.employee;

import java.time.LocalDate;

public class Employee 
{	
	private static int counter = 1;
	private int empId;   
	private String name;
	private LocalDate dateOfJoining ;
	private String phoneNumber;
	private String adharNumber;
	public Employee(String name, LocalDate dateOfJoining, String phoneNumber, String adharNumber) {
		this.empId = counter;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.phoneNumber = phoneNumber;
		this.adharNumber = adharNumber;
		counter++;
	}
	
	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", phoneNumber="
				+ phoneNumber + ", adharNumber=" + adharNumber + "]";
	}

	public String getName() {
		return name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	
	
	
	
}
