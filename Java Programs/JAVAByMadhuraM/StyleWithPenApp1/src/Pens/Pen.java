 package Pens;
//Main class for the pen
import java.time.LocalDate; 
import java.util.*;

public class Pen {
	private static int id=0;
//	private String brand;
	private Brand brand;
	private String color;
	private String Inkcolor;
//	private String material;
	private Material material;
	private int stock;
	private LocalDate UpdateDate;
	private LocalDate ListingDate;
	private double price;
	private double discount;
	public int getId() {
		return id;
	}
	public Pen(Brand brand, String color, String inkcolor, Material material, int stock, LocalDate localDate, double price) {
		super();

		this.brand = brand;
		this.color = color;
		Inkcolor = inkcolor;
		this.material = material;
		this.stock = stock;
		UpdateDate = LocalDate.now();
		ListingDate = localDate;
		this.price = price;
		this.discount = 0.0;
	}
	
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInkcolor() {
		return Inkcolor;
	}
	public void setInkcolor(String inkcolor) {
		Inkcolor = inkcolor;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getUpdateDate() {
		return UpdateDate;
	}
	public void setUpdateDate(LocalDate date1) {
		UpdateDate = date1;
	}
	public LocalDate getListingDate() {
		return ListingDate;
	}
	public void setListingDate(LocalDate listingDate) {
		ListingDate = listingDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "PenMain: \nid=" + id++ + ", \nbrand=" + brand + ", \ncolor=" + color + ", \nInkcolor=" + Inkcolor + ", \nmaterial="
				+ material + ", \nstock=" + stock + ", \nUpdateDate=" + UpdateDate + ", \nListingDate=" + ListingDate
				+ ", \nprice=" + price + ", \ndiscount=" + discount+"\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, material);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		return brand == other.brand && material == other.material;
	}
	

}
