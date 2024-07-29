package com.core;

import java.time.LocalDate;

public class Watch {
	private static int count=0;
	private int id;
	private String name;
	private Category category;
	private Brand brand;
	private Shape shape;
	private Style style;
	private BandMaterial material;
	private int Stock;
	private LocalDate StockListingDate;
	private LocalDate StockUpdateDate;
	private double price;
	private double persentageDiscount=0.0;
	public Watch( int id,String name, Category category, Brand brand, Shape shape, Style style, BandMaterial material,
			int stock,LocalDate sld,LocalDate sud, double price, double persentageDiscount) {
		super();
		this.id = ++count;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.shape = shape;
		this.style = style;
		this.material = material;
		Stock = stock;
		StockListingDate = sld;
		StockUpdateDate =sud;
		this.price = price;
		this.persentageDiscount = persentageDiscount;
	}
	@Override
	public String toString() {
		return "Watch [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", shape=" + shape
				+ ", style=" + style + ", material=" + material + ", Stock=" + Stock + ", StockListingDate="
				+ StockListingDate + ", StockUpdateDate=" + StockUpdateDate + ", price=" + price
				+ ", persentageDiscount=" + persentageDiscount + "]";
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public LocalDate getstockListingDate() {
		// TODO Auto-generated method stub
		return StockListingDate;
	}
	public void setDiscount(double d) {
		persentageDiscount=d;
		
	}
	public double getDiscount() {
		// TODO Auto-generated method stub
		return persentageDiscount;
	}
	public int getid() {
		// TODO Auto-generated method stub
		return id;
	}
	public int getStock() {
		// TODO Auto-generated method stub
		return Stock;
	}
	public void setStock(int i) {
		Stock=i;
		
	}
	
	public LocalDate getStockListingDate() {
		return StockListingDate;
	}
	public void setStockListingDate(LocalDate stockListingDate) {
		StockListingDate = stockListingDate;
	}
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		StockUpdateDate = stockUpdateDate;
	}
	
	
	
	
	
	

}
