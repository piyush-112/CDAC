package com.io;

import java.io.FileNotFoundException ;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Scanner;

import com.item.Items;

public class IOutils implements Serializable {

	
	private static final long serialVersionUID = 59346631058479906L;
	
	public static void sortByIdStored(Map<String, Items> myitems,Scanner sc) throws FileNotFoundException, IOException
	{
		System.out.print("Enter file Name: ");
		String fileName = sc.next();
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			myitems.values().stream().
			sorted((v1,v2)->v1.getItemCode().
			compareToIgnoreCase(v2.getItemCode())).
			forEach(s->{
				try {
					System.out.println(s);
					out.writeObject(s);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			});
		}
	}
	public static void sortByPriceStored(Map<String, Items> myitems,Scanner sc) throws FileNotFoundException, IOException
	{
		System.out.print("Enter file Name: ");
		String fileName = sc.next();
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			myitems.values().stream().
			sorted((v1,v2)->((Double)v1.getPrice()).compareTo(v2.getPrice())).
			forEach(s->{
				try {
					System.out.println(s);
					out.writeObject(s);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			});
		}
	}

}
