package com.validations;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.employee.FullTimeEmployee;
import com.employee.PartTimeEmployee;
import com.exceptions.EmployeeException;

public class validation 
{
	public static PartTimeEmployee validatePartTimeEmp(String name,LocalDate joiningDate,String phoneNumber,String adharNumber,double hourlyPayment) throws EmployeeException
	{
		phoneNumber = validatePhoneNumber(phoneNumber);
		adharNumber = validateAdharnumber(adharNumber);
		PartTimeEmployee e = new PartTimeEmployee(name, joiningDate, phoneNumber, adharNumber,hourlyPayment);
		return e;
	}
	
	public static FullTimeEmployee validateFullTimeEmp(String name,LocalDate joiningDate,String phoneNumber,String adharNumber,double salary) throws EmployeeException
	{
		phoneNumber = validatePhoneNumber(phoneNumber);
		adharNumber = validateAdharnumber(adharNumber);
		FullTimeEmployee e = new FullTimeEmployee(name, joiningDate, phoneNumber, adharNumber,salary);
		return e;
	}
	
	
	public static String validatePhoneNumber(String phoneNumber) throws EmployeeException
	{
		String regex = "^[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		
		if(matcher.matches())
			return phoneNumber;
		throw new EmployeeException("Invalid Mobile Number!!");
		
	}
	public static String validateAdharnumber(String adharNumber) throws EmployeeException
	{
		String regex = "[0-9]{12}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(adharNumber);
		
		if(matcher.matches())
			return adharNumber;
		throw new EmployeeException("Invalid Aadhar Number!!");
		
	}
}
