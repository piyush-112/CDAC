package com.stock;

import java.io.Serializable;
import java.time.LocalDate;

public class Stock implements Serializable
{

	private static final long serialVersionUID = -6118938071582031486L;
	private String stockId;
	private String stockName;
	private String companyName;
	private double Stockprice;
	private LocalDate closingDate;
	private int stockQuantity;
	
	
	public Stock(String stockId, String stockName, String companyName, double stockprice, LocalDate closingDate,int stockQuantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.companyName = companyName;
		Stockprice = stockprice;
		this.closingDate = closingDate;
		this.stockQuantity = stockQuantity;
	}


	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", companyName=" + companyName
				+ ", Stockprice=" + Stockprice + ", closingDate=" + closingDate + ", stockQuantity=" + stockQuantity
				+ "]";
	}


	public String getStockId() {
		return stockId;
	}


	public String getStockName() {
		return stockName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public double getStockprice() {
		return Stockprice;
	}


	public LocalDate getClosingDate() {
		return closingDate;
	}


	public int getStockQuantity() {
		return stockQuantity;
	}


	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	
	
	
	
	
	
	
}
