package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import contact.Contact;
import custom.exceptions.*;
import static validationRules.PhoneNoValidation.*;
import static validationRules.NameAndBirthDateValidation.*;


public class Utils {
	//Making a ArrayList of generic Contacts as contacts
	public static List<Contact> contacts = new ArrayList<Contact>(populateList());
	private static Scanner sc = new Scanner(System.in);
	
	//populating the list with 5 random entries
	public static List<Contact> populateList() {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact("1234567891","Ajay",LocalDate.parse("2002-12-12"),"ajay@gmail.com"));
		contacts.add(new Contact("2234567892","Vijay",LocalDate.parse("2003-11-25"),"vijay@gmail.com"));
		contacts.add(new Contact("3234567893","Saurav",LocalDate.parse("1901-12-10"),"saurav@gmail.com"));
		contacts.add(new Contact("3234567893","Tanay",LocalDate.parse("2004-09-11"),"tanay@gmail.com"));
		contacts.add(new Contact("3234567893","Meghraj",LocalDate.parse("1901-12-27"),"meghraj@gmail.com"));
		return contacts;
	}
	
	//CASE 1:
	public static void addContact() throws DuplicatePhoneNumberException, SameNameAndBirthdateException {
		System.out.println("Enter Phone no:");
		//validation for Duplicate Phone number
		String phoneNo = validatePhoneNo(sc.nextLine(),contacts);
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Birth Date (yyyy-mm-dd):");
		LocalDate dateOfBirth = LocalDate.parse(sc.next());
		sc.nextLine();
		//validation for Duplicate Name and Date of Birth
		validateNameAndBirthDate(name, dateOfBirth, contacts);
		System.out.println("Enter Email:");
		String email = sc.nextLine();
		
		//making the object for entered values
		contacts.add(new Contact(phoneNo, name, dateOfBirth, email));
		System.out.println("Contact Added successfully");
		
	}
	
	
	//CASE 2:
	public static void display() {
		//checking if the List is empty
		if(contacts.isEmpty()) {
			System.out.println("No contacts found.");
		}
		else {
			//Iterating over all the contacts for displaying
			for(Contact c:contacts) {
				System.out.println(c);
			}
		}
	}
	
	
	//CASE 3:
	public static void updateContact() {
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Birth Date");
		LocalDate dateOfBirth = LocalDate.parse(sc.next());
		sc.nextLine();
		
		System.out.println("Enter New Name:");
		String newName = sc.nextLine();
		
		for(Contact c:contacts) {
			//If name and Birth Date matches with list's contact update the contact
			if(c.getName().equals(name) && c.getDateOfBirth().equals(dateOfBirth)) {
				c.setName(newName);
				
			}
		}
	}
	
	
	//CASE 4:
	public static void remove() {
		//using functional programming for removing contacts above age 80
		contacts.removeIf(contact -> {
			//get Birth date
            LocalDate dateOfBirth = contact.getDateOfBirth();
            //get Current date
            LocalDate currentDate = LocalDate.now();
            //if the Difference between Birth Date and current date is more then delete them
            int age = Period.between(dateOfBirth, currentDate).getYears();
            return age > 80;
        });
        System.out.println("Contacts above 80 years old have been removed.");
	}
}



























