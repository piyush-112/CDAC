package Tester;


import java.time.LocalDate; 
import java.time.LocalDate.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import customer_aaplication.com.core.Customer;
import customer_aaplication.com.core.Plan;
import customer_aaplication.com.core.Validation.CustomerValidationRules;
import customer_aaplication.com.core.Validation.InvalidCustomerException;
import utility.SortByEmailDesc;
import utility.SortByName;
import utility.StoreIO;

public class Test {

	public static void main(String[] args) {
		//ArrayList<Customer> customerList=new ArrayList<>();
		//HashMap<String, Customer> hMap=PopulatedCollection.populateData();
		try {
		HashMap<String, Customer> hMap=(HashMap<String, Customer>) StoreIO.restoreDataDeser("customer.ser");
		System.out.println(hMap);
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			while(!exit)
			{try {
				System.out.println("1:Signup\n"
						+ "2:Signin\n"
						+ "3:Change Password\n"
						+ "4:Unsubscribe Customer\n"
						+ "5:display all\n"
						+ "6.Sort Customer by email in assending order\n"
						+ "7.Sort Customer by email in descending order\n"
						+ "8.customer having GOLD Plan\n"
						+ "9.Sort Customer by First Name\n"
						+ "10.Remove the customers  having silver plan\n"
						+ "11.delete old customers\n"
						+ "0:Exit\n"
						+ "Enter your choice");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter Customer details:fName,lName,email,password,plan,regiAmount,dob(yyyy-MM-dd)");
					Customer newcust=CustomerValidationRules.finalValidation(hMap,sc.next(), sc.next(),CustomerValidationRules.isValidEmail(sc.next()),CustomerValidationRules.isValidPassword(sc.next()),sc.next(),sc.nextDouble(),
							sc.next(),sc.next());
					hMap.put(newcust.getEmail(),newcust);
					
					System.out.println("signup sucssesful:"+hMap.get(newcust.getEmail()));
					
					break;
				case 2:System.out.println("Enter email and password");
				Customer p=Customer.existingEmail(hMap,sc.next());
				p.validPassword(sc.next());
				System.out.println("login succsesful:"+hMap.get(p.getEmail()));
					break;
				
				case 3://change psw
					System.out.println("Enter email and password");
					Customer temp1=Customer.existingEmail(hMap,sc.next());
					temp1.validPassword(sc.next());
					System.out.println("Enter new password : ");
					temp1.changePassword(sc.next());
					System.out.println("password changed succsesful:"+hMap.get(temp1.getEmail()));
					break;
					
				case 4://unsubscribe Person
					System.out.println("Enter email and password");
					Customer temp2=Customer.existingEmail(hMap,sc.next());
					
					temp2.validPassword(sc.next());
					System.out.println("login succsesful:"+hMap.get(temp2.getEmail()));
					
					temp2.unsub();
					System.out.println(temp2.getEmail());
					break;
				case 5:
					/*for(Customer c:hMap.values())
					System.out.println(c);*/
					hMap.forEach((k, v) -> System.out.println(v));
					break;
			
				case 6:
					TreeMap<String, Customer> tMap=new TreeMap<>(hMap);
					System.out.println("After sorting customer by their emails\n");
					/*for(Customer s:tMap.values())
						System.out.println(s);*/
					tMap.forEach((k, v) -> System.out.println(v));
					break;
				case 7:
					/*Map<String,Customer> sortedEmail = new TreeMap<>(hMap);
					sortedEmail=new TreeMap<>( new SortByEmailDesc());
					sortedEmail.putAll(hMap);
					for(Customer s:sortedEmail.values())
						System.out.println(s);*/
					hMap.values()
					.stream()
					.sorted((o1,o2)->o2.getEmail().compareTo(o1.getEmail()))
					.forEach(b->System.out.println(b));
					break;
					
				case 8:
					/*List <Customer> planlist=new ArrayList<>(hMap.values());
					Collections.sort(planlist, new SortByName());
					
					for(Customer c:planlist)
					{
						if(c.getPlan()==Plan.GOLD)
				
							System.out.println(c);
					}*/
					
				hMap.values()
				.stream()
				.filter(e->e.getPlan().equals(Plan.GOLD)).forEach(e->System.out.println(e));
					break;
					
				case 9:/*
					List <Customer> custlist=new ArrayList<>(hMap.values());
					Collections.sort(custlist, new SortByName());
					for(Customer c:custlist)
						System.out.println(c);*/
					hMap.values()
					.stream()
					.sorted((o1,o2)->o2.getfName().compareTo(o1.getfName()))
					.forEach(n->System.out.println(n));
					
					break;
				case 10://remove customer with silver plan
					hMap.values().removeIf(o->o.getPlan().equals(Plan.SILVER));
					hMap.forEach((k,v)->System.out.println(v));
					
					break;
				case 11://remove customer where signup date is old than 2years
					LocalDate today=LocalDate.now();
					
					hMap.values().removeIf(c->c .getDoc().plusDays(365).isBefore(today));
					
					break;
					

				default:
					//System.out.println("Enter file Name : ");
					StoreIO.storeDataSer(hMap, "customer.ser");
					exit=true;
					break;
				}
			}
				catch (Exception e) {
					sc.nextLine();
					System.out.println(e.getMessage());
					
					e.printStackTrace();
					
				}
			//sc.nextLine();
			}
		} 
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	}


