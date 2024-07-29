package com.tester;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.core.*;

import util.PopulateData;

import static util.PopulateData.*;

public class Test {

	public static void main(String[] args) {
		//Map<Integer,Watch> watchList=new HashMap<>(); 
		Map<Integer, Watch> watchList = populatedData();
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			int choice=0;
			
			while(!exit)
			{
				System.out.println("1:Add new Watch \n"
						+ "2:Update Stock of Watch\n"
						+ "3:set Discount of 10% for all the watch which are 1 year old\n"
						+ "4:Remove Watches which are never sold once listed in 18 months\n"
						+ "0:exit\n"
						+ "Enter choice\n");
				choice=sc.nextInt();
				switch (choice) {
				case 1://add new watch
					System.out.println("Enter watch details:name,c"
							+ ""
							+ "ategory,brand,shape,style,Bandmaterial,stock,price,persentageDiscount");
					Watch w=new Watch(0, sc.next(), Category.valueOf(sc.next().toUpperCase()),Brand.valueOf(sc.next().toUpperCase()), Shape.valueOf(sc.next().toUpperCase()), Style.valueOf(sc.next().toUpperCase()), BandMaterial.valueOf(sc.next().toUpperCase()), sc.nextInt(), LocalDate.now(), LocalDate.now(), sc.nextDouble(), sc.nextDouble());
					watchList.put(w.getId(), w);
					System.out.println("Watch added sucss...");
					break;
				case 3://set Discount of 10% for all the watch which are 1 year old
					Collection<Watch> values = watchList.values();
					LocalDate today=LocalDate.now();
					for(Watch f:values)
					{
						if(f.getstockListingDate().isBefore(today.minusYears(1)))
						{
							f.setDiscount(f.getDiscount()+10);
						}
					}
					System.out.println("Discount suc......");
					break;
				case 2://Update Stock of Watch
					Collection<Watch> values1 = watchList.values();
					System.out.println("Enter id of watch where you want to update stock");
					int idd=sc.nextInt();
					for(Watch g:values1)
					{
						if(g.getid()==idd)
						{
							int stock=g.getStock();
							System.out.println("Available stock="+stock);
							System.out.println("How many stock want to add");
							int nStock=sc.nextInt();
							g.setStock(stock+nStock);
							g.setStockUpdateDate(LocalDate.now());
						}
					}
					System.out.println("update  suc......");
					break;
				case 4:
					//Remove Watches which are never sold once listed in 18 months
					LocalDate today1=LocalDate.now();
					 watchList.values().removeIf(o->o.getstockListingDate().isBefore(today1.minusMonths(18)));
					 System.out.println("opration suc......");
					
					break;
					
				case 5://display all
					watchList.forEach((k,v)->System.out.println(v));
					break;
					

				default:
					exit=true;
					break;
				}
			}
		}
	}

	

}
