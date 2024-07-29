package com.tester;

import java.util.Scanner;

import com.developers.geometry.Point2D;

public class TestPoints1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no of points:");
		 Point2D[] pt=new Point2D[sc.nextInt()];     //create a ref
		 for(int i=0;i<pt.length;i++)                //for loop for accepting the value
		 {
			 System.out.println("Enter X: and Y:");
			 pt[i]=new Point2D(sc.nextDouble(),sc.nextDouble());
			 for(int j = 0; j <= i - 1; j++) {
				 if(pt[i].isEqual(pt[j])) {           //Compare coordinate
					 System.out.println("Pointa Are Present you can't add"); 
					 pt[i]=null;                      //if yes set null 
					 i--;
					 break;
				 }		 
		 }	 
		 }
		 for (Point2D p : pt)                          //Show the coordinate using for each
		 {	
			 System.out.println("The Coordinate of object:"+p.show());
		 }
		 sc.close();                                  //Close the Scanner;
}
}