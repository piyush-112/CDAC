package tester;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
import static com.app.validation.CustomerValidations.*; 

import com.app.customer.*;
import com.app.validation.*;
import CustomException.*;

public class CustomerTestApp {
	////	String fName, String lName, String email, String pass, double regAmount, LocalDate dob,
	public static void main(String x[]) {
		try(Scanner sc=new Scanner(System.in)){
			//Create empty ArrayList to store the customer details
			ArrayList<Customer> cust=new ArrayList<>();
			boolean exit=false;
			while(!exit) {
				System.out.println("Option= \n1. Sign up (customer registration)"
						+ "\n2. Sign in (login)"+"\n3. Change password"+"\n4. Un subscribe customer"+"\n5. Display all customers."+"\n6. Exit ");
				System.out.println("Please Enter Your Choice:");
				try {
					
					switch(sc.nextInt()) {
					//case for Entering the data for signup
					case 1:
						System.out.println("Enter the customer Details:first name ,last name ,email(string),password(string),"
								+ "registrationAmount(double),dob(LocalDate),plan(ServicePlan)");
						Customer details=CustomerValidations.validateInput(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),
								sc.next(),cust) ;
						cust.add(details);
						System.out.println("Sign up Successfully!");
						break;
					case 2:
						//case for Sign in
						System.out.println("Enter the Email :");
						String email=sc.next();
						System.out.println("Enter the password :");
						String pass=sc.next();
						Customer signin=CustomerValidations.validatesignin(email,pass,cust);
						break;
					case 3:
						//case for Change password
						System.out.println("Enter the email:");
						System.out.println("Enter the password:");
						Customer password=CustomerValidations.UpdatePassword(sc.next(),sc.next(),cust);
						break;
					case 4:
						//case Un subscribe customer
						System.out.println("Work in progress"); 
						break;
					case 5:
						//case Display all customers
						System.out.println("The customer details are");
						for(Customer c:cust) {
							System.out.println(c.getfName()+"\t"+c.getlName()+"\t"+c.getEmail()+"\t"+c.getRegAmount()+"\t"+c.getPlan());
						}
						break;
					case 6:
						exit=true;
						System.out.println("Happy Ending");
						break;
					}
				}catch(Exception ex) {
					System.out.println(ex);
					System.out.println("Please try Again!");
				}
			}
					
		}
	}
}
