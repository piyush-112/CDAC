package com.utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.employee.Employee;
import com.employee.FullTimeEmployee;
import com.employee.PartTimeEmployee;

public class PopulateData 
{	//String name, LocalDate dateOfJoining, String phoneNumber, String adharNumber
	public static HashMap<Integer, Employee> populateEmployee()
	{
		HashMap<Integer, Employee> myEmployees = new HashMap<>();
		
		myEmployees.put(1, new FullTimeEmployee("Vallabh Jadhav", LocalDate.parse("2020-02-02"), "9075938091", "441474426415", 50000));
		myEmployees.put(2, new FullTimeEmployee("Jayesh Sapkale", LocalDate.parse("2022-12-27"), "123456789", "451447486475", 60000));
		myEmployees.put(3, new FullTimeEmployee("Guru kamble", LocalDate.parse("2021-08-15"), "987654321", "741578429410", 70000));
		myEmployees.put(4, new FullTimeEmployee("Akash Solunke", LocalDate.parse("2023-07-02"), "456789123", "561470026415", 80000));
		myEmployees.put(5, new PartTimeEmployee("Jadugar Chatrivale", LocalDate.parse("2024-07-14"), "789123456", "261571201564", 200));
		myEmployees.put(6, new PartTimeEmployee("Jadugar Chatrivale", LocalDate.parse("2022-01-01"), "456789123", "371571301678", 400));
		myEmployees.put(7, new PartTimeEmployee("Jadugar Chatrivale", LocalDate.parse("2023-04-29"), "7584689542", "422671754414", 350));
		
		return myEmployees;
	}
}
