package com.utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.stock.Stock;

public class PopulateData 
{
	public static HashMap<String, Stock> poplateMap()
	{
		HashMap< String, Stock> myStocks = new HashMap<>();
		
		myStocks.put("A101", new Stock("A101", "TataSteel", "Tata", 25000, LocalDate.parse("2024-10-12"), 10));
		myStocks.put("B221", new Stock("B221", "Adani Power", "Adani Enterprises", 5000, LocalDate.parse("2024-12-28"), 50));
		myStocks.put("A456", new Stock("A456", "MRF tyres", "MRF", 250000, LocalDate.parse("2025-10-01"), 5));
		myStocks.put("C609", new Stock("C609", "Mankind cosmatics", "Mankind", 10000, LocalDate.parse("2024-05-17"), 100));
		myStocks.put("D500", new Stock("D500", "Ashok Leyland Ltd.", "Ashok Leyand", 50000, LocalDate.parse("2024-06-12"), 15));
		
		
		return myStocks;
	}
}
