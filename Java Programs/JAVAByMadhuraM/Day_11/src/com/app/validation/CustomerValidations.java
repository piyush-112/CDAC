package com.app.validation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.customer.Customer;
import com.app.customer.ServicesPlan;

import CustomException.InvalidEmailFormate;
import CustomException.InvalidPlanException;
import CustomException.NoDuplicateCustomer;

public class CustomerValidations {
	//add a public static method to validate the inpute
	public static Customer validateInput(String fName, String lName, String email, String pass, double regAmount, String dob,
			String plan,ArrayList<Customer> cust) throws IllegalArgumentException,NoDuplicateCustomer,InvalidPlanException,InvalidEmailFormate{
		for(Customer c:cust) {
			if(c.getEmail().equals(email)) {
				throw new NoDuplicateCustomer("Already customer Present");
			}
		}
		return new Customer(fName,lName,email, pass,regAmount, LocalDate.parse(dob) ,
			ServicesPlan.valueOf(plan)) ;
		
	}
	public static Customer validatesignin(String email,String pass,ArrayList<Customer> cust) throws InvalidEmailFormate {
		for(Customer c:cust) {
		if((c.getEmail().contains("@"))&&(c.getEmail().contains("gmail.com"))&&(c.getEmail().equals(email))&& (c.getPass().equals(pass))){
			System.out.println("login Successfully!");
		}
		else {
			throw new InvalidEmailFormate("Please check the emails");
		}
	}
		return null;
	}
	
	public static Customer UpdatePassword(String email,String pass,ArrayList<Customer>cust) {
		int flag=0;
		for(Customer c:cust) {
		if(c.getEmail().equals(email)) {
			flag=1;
		}
		if(flag==1) {
			c.setPass(pass);
			System.out.println("Password Update successfully!");
		}
		else {
			System.out.println("Email not found!");
		}
		}
		return null;
	}
	
}
