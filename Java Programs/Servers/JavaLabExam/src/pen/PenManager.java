package pen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PenManager {
	List<Pen> pens= new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public void addPen()
	{
		System.out.println("Enter  brand,  color,  inkColor,  material,  stock,  stockUpdateDate, price,  discoun");
		pens.add(new Pen(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),  sc.nextInt() ,sc.next(),sc.nextDouble(), sc.nextDouble()));
	}
	
	public void updatePens(int id, int stock,String brand,String material,String color)
	{
		Pen pns=findById(id);
		for(Pen p: pens) {
			if(pns!=null)
			{
				p.setBrand(brand);
				p.setMaterial(material);
				p.setColor(color);
				p.setInkColor(color);
				p.setStock(stock);
				
			}else {
				System.out.println("Pen not found");
			}
			
			
				
				
				
				
			}
	}
	
	public void discountThreeMonths()
	{
		LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
		for(Pen p: pens)
		{
			if(p.getStockListingDate().isBefore(threeMonthsAgo))
			{
				p.setDiscount(0.2);
			}
		}
			
	}
	
	public void removePenLessNineMonth() {
		LocalDate nineMonthAgo= LocalDate.now().minusMonths(9);
		List<Pen> removeList= new ArrayList<>();
		
		for(Pen p: pens)
		{
			if(p.getStockListingDate().isBefore(nineMonthAgo))
			{
				removeList.add(p);
			}
			
		}
		pens.removeAll(removeList);
	}
	
	public void displayPens()
	{
		for(Pen p:pens)
		{
			System.out.println(p);
		}
	}
		

	private Pen findById(int id)
	{
		for(Pen p:pens) {
		if(p.getId() == id)
		{
			return p;
			
		}}
		return null;
		
	
	
	}
	
}
	

