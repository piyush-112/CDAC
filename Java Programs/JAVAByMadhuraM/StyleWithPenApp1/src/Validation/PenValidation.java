package Validation;
import Validation.*; 
import Tester.PenTesterApp.*; 

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

import Exception.PenBrandPresentException;
import Pens.Brand;
import Pens.Material;
import Pens.Pen;

public class PenValidation {
	public static Pen addpen(String brand, String color, String inkColor, String material, int stock,
			String date, double price, ArrayList<Pen> pen) throws PenBrandPresentException {
		for(Pen p:pen) {
			if(p.getBrand().equals(brand)) {
				throw new PenBrandPresentException("Alredy pen brand was present ,you must update the stock");
			}
		}
		return new Pen(Brand.valueOf(brand),  color,  inkColor,  Material.valueOf(material),  stock,LocalDate.parse(date), price);
		

	}

	@SuppressWarnings("unlikely-arg-type")
	public static Pen updateStock(String brand1, String color1, String inkColor1, int stock1,ArrayList<Pen> pen) {
		if (!pen.isEmpty()) {
			for (Pen p : pen) {
				if (p.getBrand()==Brand.valueOf(brand1) && p.getColor().equals(color1)&&p.getInkcolor().equals(inkColor1)) {
					p.setStock(stock1);
					System.out.println("Updation of the stocks!");
					break;
				} else {
					System.out.println("Brand is not found that why we are not able to update the stock");
					break;
				}
			}
		} else {
			System.out.println("Your pen inventory was alredy empty");
		}
		return null;
  
	}
	
	public static Pen setDiscount(ArrayList<Pen> pen) {
		 LocalDate currentDate = LocalDate.now();
		 for (Pen p : pen) {
             long diffMonths = p.getListingDate().until(currentDate).toTotalMonths();
             if(diffMonths>=3 && p.getStock()>0) {
            	 p.setDiscount(20.0);
            	 p.setPrice(p.getPrice()*0.2);
             }
	}
		return null;
	}
	
	public static Pen removePens(ArrayList<Pen> pen) {
		LocalDate currentDate = LocalDate.now();
		Iterator<Pen> iterator=pen.iterator();
		while(iterator.hasNext()) {
			Pen pens=iterator.next();
			long diffMonths = pens.getListingDate().until(currentDate).toTotalMonths();
			if(diffMonths>=9 &&pens.getStock()>0) {
				iterator.remove();
				System.out.println("Pen ID " + pens.getId()+"   "+pens.getBrand() + " removed.");
			}
		}
		return null;
	}

}
