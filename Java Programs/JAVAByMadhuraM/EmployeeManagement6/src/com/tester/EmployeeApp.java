package com.tester;

import java.util.Map;
import java.util.Scanner;

import com.employee.Employee;
import com.utils.PopulateData;
import static com.utils.Utilities.*;

public class EmployeeApp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Employee> myEmployees = PopulateData.populateEmployee();
			boolean exit = false;
			String choice;

			while (!exit) {
				System.out.println("\t\nMenu");
				System.out.println("1.Add part Time Employee");
				System.out.println("2.Add Full Time Employee");
				System.out.println("3.Delete Employee by EmpId");
				System.out.println("4.Search Employee Details by Aadhar Number");
				System.out.println("5.Display All Employee Details");
				System.out.println("6.Display All Employee Details Sort by Date of Joining");
				System.out.println("0.Exit");

				System.out.print("Enter Your Choice: ");
				choice = sc.next();

				try {
					switch (choice) {
					case "1":
						addPartTimeEmp(myEmployees, sc);
						System.out.println("Employee Added Succesfully");
						break;
					case "2":
						addFullTimeEmp(myEmployees, sc);
						System.out.println("Employee Added Succesfully");
						break;
					case "3":
						deleteEmpById(myEmployees, sc);
						System.out.println("Employe Remove Successfully!!");
						break;
					case "4":
						System.out.println("Displaying Employee Details\n");
						searchEmployeeByAdhar(myEmployees, sc);
						break;
					case "5":
						System.out.println("Displaying Employee Details\n");
						displayAllEmployee(myEmployees);
						break;
					case "6":
						System.out.println("\n");
						sortByDateofJoining(myEmployees);
						break;
					case "0":
						System.out.println("Exiting App");
						exit = true;
						break;

					default:
						System.out.println("Invalid Choice!!");
						break;
					}

				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
