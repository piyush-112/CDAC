package tester;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.core.Grocery;

import Validation.myGroceryException;

public class Tester {

	public static void main(String[] args) {
	    Map<String, Grocery> list=new HashMap<String, Grocery>();
	    boolean exit=false;
	    int choice=0;
	    try(Scanner sc=new Scanner(System.in))
	    {
	    	while(!exit)
	    	{
	    		try {
	    		System.out.println("1:Add new item to list\n"
	    				+ "2:Update the quntity of a grocery item in stock\n"
	    				+ "3:Display the list of grocery items\n"
	    				+ "4:Remove all empty stock items\n"
	    				+ "5:Display all products for which stock update in last 3 days\n"
	    				+ "0:exit\n"
	    				+ "Enter choice");
	    				
	    				switch (sc.nextInt()) {
						case 1://Add new item to list
							System.out.println("Enter name,price,stock of grocery");
							Grocery g= new Grocery(sc.next(),sc.nextDouble(),sc.nextInt(), LocalDateTime.now());
							Grocery putIfAbsent = list.putIfAbsent(g.getName(), g);
							if(putIfAbsent!=null)
							{
								throw new myGroceryException("this item already present ony update it");
							}
							
							break;
						case 2://2:Update the quntity of a grocery item in stock
							System.out.println("Enter grocery name where you want to update stock");
							String nameN=sc.next();
							Grocery g1 = list.get(nameN);
							System.out.println("Available stock="+g1.getAvailableStock());
							System.out.println("Enter +count for adding stock and for remove -count");
							g1.setAvailableStock(g1.getAvailableStock()+sc.nextInt());
							setStockUpdateDateTime(LocalDateTime.now());
							System.out.println("updated......");
							break;
						case 3://Display the list of grocery items
							list.forEach((k,v)->System.out.println(v));
							break;
						case 4://Remove all empty stock items
							
						list.values().removeIf(o->o.getAvailableStock()==0);
						System.out.println("Empty stock removed suc.....");
							break;
						case 5://Display all products for which stock update in last 3 days
							list.values().stream().filter(o->o.getStockUpdateDateTime().isAfter(LocalDateTime.now().minusDays(3))).forEach(l->System.out.println(l));;
							
							break;

						default:
							exit=true;
							break;
						}
	    		}catch(Exception e)
						{
							System.out.println(e);
						}
	    				
	    	
	    }

	}

}

	private static void setStockUpdateDateTime(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
}
