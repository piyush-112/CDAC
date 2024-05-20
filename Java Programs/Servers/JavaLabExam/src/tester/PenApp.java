package tester;

import java.util.Scanner;

import pen.*;

public class PenApp {

	public static void main(String[] args) {
		PenManager manager=new PenManager();
		Scanner sc= new Scanner(System.in);
		int choice = 1;
       do {
    	   System.out.println(" 1. Add new Pen\r\n"
    	   		+ "2. Update stock of aPen\r\n"
    	   		+ "3.Set discount of 20% forpub all the pens which are not at all sold in last 3 months\r\n"
    	   		+ "4. Remove Pens which are never sold once listed in 9 months\r\n"
    	   		+ "5.Display pens");
    	   System.out.println("Enter choice");
    	   
			switch (sc.nextInt()) {
			case 1:
				manager.addPen();
				break;
			case 2:
				System.out.println("Enter update details  id, stock, brand, material, color");
				manager.updatePens(sc.nextInt(), sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine());			
				break;
			case 3:
				//discount
				manager.discountThreeMonths();
				
				break;
			case 4:
				//months
				manager.removePenLessNineMonth();
				break;
			case 5:
				//months
				manager.displayPens();
				break;

			default:
				break;
			}
			
			
			
			
			
		}while(choice<=4);
       sc.close();
		

	}

}
