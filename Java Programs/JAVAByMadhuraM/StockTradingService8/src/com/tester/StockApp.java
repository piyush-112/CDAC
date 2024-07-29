package com.tester;

import java.util.Map;
import java.util.Scanner;

import com.stock.Stock;
import com.utils.PopulateData;
import static com.utils.Utilities.*;
import static com.utils.IOutils.*;

public class StockApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Stock> myStocks = PopulateData.poplateMap();

			boolean exit = false;
			String choice;

			while (!exit) {
				System.out.println("\t\nMenu");
				System.out.println("1.Add Stock");
				System.out.println("2.View Available Stock by Company name");
				System.out.println("3.Purchase Stock");
				System.out.println("4.Sell Stock");
				System.out.println("5.Save in Binary File");
				System.out.println("6.Display All Stocks");
				System.out.println("0.Exit");

				System.out.print("Enter Your choice: ");
				choice = sc.next();

				try {
					switch (choice) {
					case "1":
						addStock(myStocks, sc);
						System.out.println("Stock Added Succesfully!!");
						break;
					case "2":
						viewStockByName(myStocks, sc);
						break;
					case "3":
						purchaseStock(myStocks, sc);
						System.out.println("Stock Purchase successfully!!");
						break;
					case "4":
						sellStock(myStocks, sc);
						System.out.println("Stock sold successfully!!");
						break;
					case "5":
						saveInBinary(myStocks, sc);
						System.out.println("Save in Binay File");
						break;
					case "6":
						displayAllStock(myStocks);
						break;
					case "0":
						exit = true;
						System.out.println("Shutter Down!!!");
						break;
					default:
						System.out.println("Invalid Choice!!");
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

}
