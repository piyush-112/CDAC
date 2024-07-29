package tester;

import static utils.Utils.*;


import java.util.Scanner;

public class PhoneBookTester {

	public static void main(String[] args) {
		
		//try block for auto closable resources
		try(Scanner sc = new Scanner(System.in)){
			
			//exit boolean for while iterations
			boolean exit=false;
			while(!exit) {
				System.out.println("--Phone Book Application--");
				System.out.println("1. Add New Contact");
				System.out.println("2. Display All Contact Details");
				System.out.println("3. Update Contact Details using Name & Birthdate");
				System.out.println("4. Remove all contacts above 80");
				System.out.println("5. Exit");
				System.out.println("Enter your choice:");
				try {
					switch(sc.nextInt()) {
					case 1:
						addContact();
						break;
					case 2:
						display();
						break;
					case 3:
						updateContact();
						break;
					case 4:
						remove();
						break;
					case 5:
						exit=true;
						System.out.println("Exit successful");
						break;

					default:
						System.out.println("Invalid choice! Please enter a number between 1 and 5.");
						break;
					}
				}	
					//if user enters a wrong input in middle of case it will let user re enter values
					catch(Exception ex) {
					System.out.println(ex);
					System.out.println("Please try again!");
				}
				
			}
		}

	}

}
