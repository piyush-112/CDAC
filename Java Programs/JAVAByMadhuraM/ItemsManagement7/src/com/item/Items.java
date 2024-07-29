package com.item;

import java.io.Serializable;
import java.time.LocalDate;

public class Items implements Serializable
{
	
	private static final long serialVersionUID = -143398989546184576L;
	private String itemCode;
	private String Description;
	private double price;
	private LocalDate shipmentDate;
	public Items(String itemCode, String description, double price, LocalDate shipmentDate) {
		super();
		this.itemCode = itemCode;
		Description = description;
		this.price = price;
		this.shipmentDate = shipmentDate;
	}
	@Override
	public String toString() {
		return "Items [itemCode=" + itemCode + ", Description=" + Description + ", price=" + price + ", shipmentDate="
				+ shipmentDate + "]";
	}
	public String getItemCode() {
		return itemCode;
	}
	public String getDescription() {
		return Description;
	}
	public double getPrice() {
		return price;
	}
	public LocalDate getShipmentDate() {
		return shipmentDate;
	}
	
	
}
