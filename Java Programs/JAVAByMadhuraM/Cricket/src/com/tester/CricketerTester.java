package com.tester;

import java.util.Map;
import java.util.Scanner;

import com.cricket.Cricketer;
import com.utils.PopulateData;
import com.validation.CricketException;
import com.validation.Validations;

public class CricketerTester 
{
	public static void main(String[] args) throws CricketException
	{
		try(Scanner sc = new Scanner(System.in))
		{
			Map<String, Cricketer> myPlayers =PopulateData.populatePlayers();
			boolean exit = false;
			String choice ;
			
			while(!exit)
			{
				System.out.println("\t\nMenu");
				System.out.println("1.Accept Crickter");
				System.out.println("2.Update Rating");
				System.out.println("3.Search Crickter by Name");
				System.out.println("4.Display All Crickter");
				System.out.println("5.Display All Crickters Sort by Rating");
				System.out.println("0.Exit");
				
				System.out.print("Enter your Choice: ");
				choice = sc.next();
				
				switch (choice) {
				case "1":
					System.out.print("Enter Name of player: ");
					String name = sc.next();
					System.out.print("Enter player Age: ");
					int age = sc.nextInt();
					System.out.print("Enter Mail of player: ");
					String mail = sc.next();
					System.out.print("Enter Phone Number of player: ");
					String phoneNumber = sc.next();
					System.out.print("Enter rating of player: ");
					int rating = sc.nextInt();
					Validations.validName(myPlayers, name);
					Cricketer c = new Cricketer(name, age, mail, phoneNumber, rating);
					
					myPlayers.put(c.getCrickterName(), c);
					
					break;
				case "2":
					System.out.print("Enter Name of Player: ");
					name = sc.next();
					Validations.validateName(myPlayers, name);
					System.out.print("Enter new rating: ");
					rating = sc.nextInt();				
					myPlayers.values().stream().forEach(s->s.setRatings(rating));
					System.out.println("Rating updtaed Successfully");
					break;
				case "3":
					System.out.print("Enter Name of Player: ");
					name = sc.next();
					Validations.validateName(myPlayers, name);
					System.out.println("\n\tPlayer Found\t\n");
					myPlayers.values().stream().
					filter(s->s.getCrickterName().equals(name)).
					forEach(s->System.out.println(s));
					break;
				case "4":
					System.out.println("\n\tDisplaing data\t\n");
					myPlayers.values().stream().forEach(v->System.out.println(v));
					break;
				case "5":
					myPlayers.values().stream().
					sorted((v1,v2)->((Integer)v1.getRatings()).
							compareTo(v2.getRatings())).
					forEach(s->System.out.println(s));
					break;
				case "0":
					exit = true ;
					System.out.println("Exiting App");
					break;

				default:
					System.out.println("Invalid Choice!!");
					break;
				}
			}
		}
	}
}
