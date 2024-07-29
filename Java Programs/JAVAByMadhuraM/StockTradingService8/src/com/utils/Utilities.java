package com.utils;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import static com.validation.ValidateAll.*;

import com.exception.StockException;
import com.stock.Stock;

public class Utilities 
{
	//String stockId, String stockName, String companyName, double stockprice, LocalDate closingDate,int stockQuantity
	public static void addStock(Map<String, Stock> myStocks,Scanner sc) throws StockException
	{
		System.out.print("Enter StockId: ");
		String stockId = sc.next();
		System.out.print("Enter StockName: ");
		String stockName = sc.next();
		System.out.print("Enter Company name: ");
		String companyName = sc.next();
		System.out.print("Enter Stock Price: ");
		double price = sc.nextDouble();
		System.out.print("Enter Closing Date: ");
		LocalDate closingDate = LocalDate.parse(sc.next());
		System.out.print("Enter Stock Quantity: ");
		int quantity = sc.nextInt();
		
		Stock s = validateAll(stockId,stockName,companyName,price,closingDate,quantity,myStocks);
		myStocks.put(s.getStockId(), s);
	}
	
	public static void viewStockByName(Map<String, Stock> myStocks,Scanner sc)throws StockException
	{
		System.out.print("Enter Company Name: ");
		String companyName = sc.next();
		
		myStocks.values().stream().filter(v->v.getCompanyName().equals(companyName)).forEach(v->System.out.println(v));
	}
	
	public static void purchaseStock(Map<String, Stock> myStocks,Scanner sc)throws StockException
	{
		System.out.print("Enter StockId: ");
		String stockId = sc.next();
		
		String stockID = validStockId(myStocks,stockId);
		System.out.print("Enter Quantity of Stock: ");
		int quantity = sc.nextInt();
		int quant = validateQuantity(myStocks,stockId,quantity);
		
		myStocks.values().stream().filter(v->v.getStockId().equals(stockID)).forEach(v->v.setStockQuantity(v.getStockQuantity()-quant));
	}
	
	public static void sellStock(Map<String, Stock> myStocks,Scanner sc)throws StockException
	{
		System.out.print("Enter StockId: ");
		String stockId = sc.next();
		
		stockId = validStockId(myStocks,stockId);
		System.out.print("Enter Quantity of Stock: ");
		int quantity = sc.nextInt();
		
		
		int exQuantity = myStocks.get(stockId).getStockQuantity();
		
		myStocks.get(stockId).setStockQuantity(exQuantity+quantity);
	}
	
	
	public static void displayAllStock(Map<String, Stock> myStocks)throws StockException
	{
		myStocks.values().stream().forEach(v->System.out.println(v));
	}
	
	
}
