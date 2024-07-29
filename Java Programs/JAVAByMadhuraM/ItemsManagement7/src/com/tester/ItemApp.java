package com.tester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.item.Items;
import com.utils.PopulateData;
import static com.io.IOutils.*;

public class ItemApp {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Items> saurabhItems = PopulateData.populateItems();
			boolean exit = false;
			String choice;

			while (!exit) {
				System.out.println("\t\nMenu");
				System.out.println("1.Add Item to List");
				System.out.println("2.Sort Data by ItemCode and Stored in Binary File");
				System.out.println("3.Sort Data by ItemPrice and Stored in Binary File");
				System.out.println("4.Display All Items");
				System.out.println("0.Exit");

				System.out.print("Enter Your choice: ");
				choice = sc.next();
				try {
					switch (choice) {
					case "1":
						
						break;

					case "2":
						sortByIdStored(saurabhItems, sc);
						System.out.println("Data Stored Successfully!!!");
						break;
					case "3":
						sortByPriceStored(saurabhItems, sc);
						System.out.println("Data Stored Successfully!!!");
						break;
					case "4":
						saurabhItems.values().stream().forEach(v -> System.out.println(v));
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
