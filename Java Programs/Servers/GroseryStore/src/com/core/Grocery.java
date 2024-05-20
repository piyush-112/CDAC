package com.core;


import java.time.LocalDateTime;

public class Grocery {
private String name;
private double pricePerUnit;
private int availableStock;
private LocalDateTime stockUpdateDateTime;

public Grocery(String name, double pricePerUnit, int availableStock, LocalDateTime stockUpdateDateTime) {
	super();
	this.name = name;
	this.pricePerUnit = pricePerUnit;
	this.availableStock = availableStock;
	this.stockUpdateDateTime = stockUpdateDateTime;
}

@Override
public String toString() {
	return "Grocery [name=" + name + ", pricePerUnit=" + pricePerUnit + ", availableStock=" + availableStock
			+ ", stockUpdateDateTime=" + stockUpdateDateTime + "]";
}

public String getName() {
	
	return name;
}

public int getAvailableStock() {
	// TODO Auto-generated method stub
	return availableStock;
}


	


public LocalDateTime getStockUpdateDateTime() {
	return stockUpdateDateTime;
}

public void setStockUpdateDateTime(LocalDateTime stockUpdateDateTime) {
	this.stockUpdateDateTime = stockUpdateDateTime;
}

public void setName(String name) {
	this.name = name;
}

public void setPricePerUnit(double pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
}

public void setAvailableStock(int a) {
	this.availableStock = a;
}



}
