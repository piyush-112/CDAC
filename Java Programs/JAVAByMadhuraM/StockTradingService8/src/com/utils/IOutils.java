package com.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

import com.stock.Stock;

public interface IOutils 
{
	public static void saveInBinary(Map<String, Stock> myStocks,Scanner sc) throws FileNotFoundException, IOException
	{	
		System.out.println("Enter File Name: ");
		String fileName = sc.next();
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(myStocks);
		}
	}
}
