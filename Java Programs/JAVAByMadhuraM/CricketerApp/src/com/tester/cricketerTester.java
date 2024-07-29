package com.tester;

import java.util.*;

import com.cricketer.cricketer;
import com.utils.populateData;

public class cricketerTester {
	public static void main(String x[]) {
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			//create the map for storing the data
			Map<Integer,cricketer> myplayer = populateData.populate();
			while(!exit) {
				System.out.println("Option:\n"
				          +"1. Add Player\n"
				          +"2. Modify Cricketer's Rating\n"
				          +"3. Search Cricketer by name\n"
				          +"4. Display the Player\n"
				          +"5. All Cricketers in sorted form by rating\n");
				System.out.println("Enter your choice:");
			try {
				switch (sc.nextInt()) {
				//case for adding the new player
				case 1:
					System.out.println("Enter the name of the Player:");
					String name=sc.next();
					System.out.println("Enter the age of the Player:");
					int age=sc.nextInt();
					System.out.println("Enter the email of the player:");
					String email=sc.next();
					System.out.println("Enter the phone number:");
					String phone=sc.next();
					System.out.println("Enter the Rating of the Player:1 to 10");
					int rating=sc.nextInt();
					cricketer c=new cricketer(name,age,email,phone,rating);
					myplayer.put(c.getPid(), c);
					break;
				
				//case for Modify Cricketer's Rating
				case 2:
					System.out.println("Enter the id of the player:");
					int id=sc.nextInt();
					System.out.println("Enter the rating of the player:");
					int rating1=sc.nextInt();
					myplayer.values().stream()
					.filter(s -> s.getPid()==id)
					.forEach(s -> s.setRating(rating1));
					System.out.println("Rating updated!");
					break;
					
				//case for Search Cricketer by name
				case 3:
					System.out.println("Enter the name of the player:");
					String pname=sc.next();
					myplayer.values().stream()
					.filter(s -> s.getName().contains(pname))
					.forEach(s -> System.out.println(s));
					break;
					
				//case for Display the Player
				case 4:
					myplayer.values().stream()
					.forEach(s -> System.out.println(s));
					break;
                
				//case for All Cricketers in sorted form by rating
				case 5:
					myplayer.values().stream()
					.sorted((s1, s2) -> ((Integer)s1.getRating()).compareTo(s2.getRating()))
					.forEach(s -> System.out.println(s));
					break;
					
				//case for termination
				case 6:
					exit=true;
					System.out.println("Exit Successfully");
				
				default:
					System.out.println("Invalid Input");
					break;
				}
				
			}catch(Exception ex) {
				sc.next();
				System.out.println(ex);
				System.out.println("Exit Successfully!");
			}
		}
	}
}
}
