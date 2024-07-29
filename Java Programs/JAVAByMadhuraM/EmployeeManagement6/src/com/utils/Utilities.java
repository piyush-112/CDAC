package com.utils;

import java.time.LocalDate; 
import java.util.Map;
import java.util.Scanner;
import static com.validations.validation.*;
import com.employee.Employee;
import com.employee.PartTimeEmployee;
import com.exceptions.EmployeeException;

public class Utilities {
	//// String name, LocalDate dateOfJoining, String phoneNumber, String
	//// adharNumber
	public static void addPartTimeEmp(Map<Integer, Employee> myEmployees, Scanner sc) throws EmployeeException {
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Joining Date: ");
		LocalDate joiningDate = LocalDate.parse(sc.next());
		System.out.print("Enter Phone Number: ");
		String phoneNumber = sc.next();
		System.out.print("Enter Aadhar Number: ");
		String adharNumber = sc.next();
		System.out.print("Enter Payement per Hour: ");
		double hourlyPyment = sc.nextDouble();

		PartTimeEmployee e = validatePartTimeEmp(name, joiningDate, phoneNumber, adharNumber, hourlyPyment);
		myEmployees.put(e.getEmpId(), e);
	}

	public static void addFullTimeEmp(Map<Integer, Employee> myEmployees, Scanner sc) throws EmployeeException {
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Joining Date: ");
		LocalDate joiningDate = LocalDate.parse(sc.next());
		System.out.print("Enter Phone Number: ");
		String phoneNumber = sc.next();
		System.out.print("Enter Aadhar Number: ");
		String adharNumber = sc.next();
		System.out.print("Enter Monthly Salary: ");
		double salary = sc.nextDouble();

		Employee e = validateFullTimeEmp(name, joiningDate, phoneNumber, adharNumber, salary);
		myEmployees.put(e.getEmpId(), e);
	}

	public static void deleteEmpById(Map<Integer, Employee> myEmployees, Scanner sc) {
		System.out.println("Enter Employee Id To Delete: ");
		int empId = sc.nextInt();

		myEmployees.values().removeIf(v -> v.getEmpId() == empId);
	}

	public static void searchEmployeeByAdhar(Map<Integer, Employee> myEmployees, Scanner sc) {
		System.out.println("Enter Employee Aadhar Number: ");
		String adhar = sc.next();

		myEmployees.values().stream().filter(v -> v.getAdharNumber().equals(adhar)).forEach(v -> System.out.println(v));
	}

	public static void displayAllEmployee(Map<Integer, Employee> myEmployees) {
		myEmployees.values().stream().forEach(v -> System.out.println(v));
	}

	public static void sortByDateofJoining(Map<Integer, Employee> myEmployees) {
		myEmployees.values().stream().sorted((v1, v2) -> v1.getDateOfJoining().compareTo(v2.getDateOfJoining()))
				.forEach(v -> System.out.println(v));
	}
}
