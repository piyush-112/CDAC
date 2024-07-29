package Tester;
import customer_aaplication.com.core.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import customer_aaplication.com.core.Customer;
import static customer_aaplication.com.core.Plan.*;

public class PopulatedCollection {
	public static HashMap<String,Customer> populateData()
	{
		HashMap<String,Customer> cust=new HashMap<>();
		cust.put("vaishu1@gmail.com", new Customer("vaishu","Sarode","vaishu1@gmail.com","vaishu29", GOLD ,3000,LocalDate.parse("2002-01-29"),LocalDate.parse("2022-01-29")));
		cust.put("poonam2@gmail.com", new Customer("poonam","fulsundar","poonam2@gmail.com","poonam23", SILVER ,1000,LocalDate.parse("1998-01-25"),LocalDate.parse("2012-01-29")));
		cust.put("raju1@gmail.com", new Customer("raju","Mahajan","raju1@gmail.com","vaishu29", PLATINUM ,10000,LocalDate.parse("2006-01-27"),LocalDate.parse("2017-01-29")));
		cust.put("piyu2@gmail.com", new Customer("piyu","Chirmade","piyu2@gmail.com","vaishu29", GOLD ,3000,LocalDate.parse("2004-02-21"),LocalDate.parse("2024-01-29")));
		cust.put("ankit3@gmail.com", new Customer("ankit","Sarode","ankit3@gmail.com","vaishu29", SILVER,3000,LocalDate.parse("2003-04-20"),LocalDate.parse("2023-11-29")));
		cust.put("tina4@gmail.com", new Customer("tina","Patil","tina4@gmail.com","vaishu29", GOLD ,3000,LocalDate.parse("2001-05-09"),LocalDate.parse("2024-04-29")));
		cust.put("jayu5@gmail.com", new Customer("jayu","Kolhe","jayu5@gmail.com","vaishu29", GOLD ,3000,LocalDate.parse("2000-07-22"),LocalDate.parse("2024-01-29")));
		cust.put("vaishusarode6@gmail.com", new Customer("vaishu","Sarode","vaishusarode6@gmail.com","vaishu29", SILVER ,3000,LocalDate.parse("2000-08-24"),LocalDate.parse("2024-01-29")));
		
		
		return cust;
	}
	
}