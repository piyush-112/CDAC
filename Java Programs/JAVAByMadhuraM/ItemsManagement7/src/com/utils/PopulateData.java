package com.utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.item.Items;

public class PopulateData 
{
	public static HashMap<String, Items> populateItems()
	{
		HashMap<String, Items> myitems = new HashMap<>();
		myitems.put("A101", new Items("A101", "Furniture", 15000, LocalDate.parse("2024-02-02")));
		myitems.put("B111", new Items("B111", "Grocery", 5000, LocalDate.parse("2024-10-10")));
		myitems.put("A114", new Items("A114", "Clothes", 10000, LocalDate.parse("2024-04-28")));
		myitems.put("C202", new Items("C202", "Utils", 7000, LocalDate.parse("2024-03-04")));
		myitems.put("D456", new Items("D456", "Shoes", 70000, LocalDate.parse("2024-07-02")));
		myitems.put("D700", new Items("D700", "Other", 500, LocalDate.parse("2024-01-01")));
		
		return myitems;
	}
}
