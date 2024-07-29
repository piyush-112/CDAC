package com.validation;

import java.time.LocalDate;
import java.util.Map;

import com.exception.StockException;
import com.stock.Stock;

public class ValidateAll 
{
	public static Stock validateAll(String stockId,String stockName,String companyName,
			double price,LocalDate closingDate,int quantity,Map<String, Stock> myStocks)throws StockException
	{
		stockId = validateStockId(myStocks,stockId);
		closingDate = validateClosingDate(closingDate);
		Stock s = new Stock(stockId, stockName, companyName, price, closingDate, quantity);
		return s;
	}
	
	public static String validateStockId(Map<String, Stock> myStocks,String stockId)throws StockException
	{
		if(myStocks.get(stockId).getStockId().equals(stockId))
		{
			throw new StockException("StockId Already Available");
		}
		return stockId;
	}
	
	public static LocalDate validateClosingDate(LocalDate closingDate)throws StockException
	
	{
		if(closingDate.isAfter(LocalDate.now()))
		{
			return closingDate;
		}
		throw new StockException("Invalid Closing Date!!");
	}
	
	public static String validStockId(Map<String, Stock> myStocks,String stockId)throws StockException
	{
		if(myStocks.get(stockId).getStockId().equals(stockId))
		{
			return stockId;
		}
		throw new StockException("Invalid StockID!!");
	}
	public static int  validateQuantity(Map<String, Stock> myStocks,String stockId,int quantity)throws StockException
	{
		if(myStocks.get(stockId).getStockQuantity()>(quantity))
		{
			return quantity;
		}
		throw new StockException("Insufficient stocks!!");
	}
}
