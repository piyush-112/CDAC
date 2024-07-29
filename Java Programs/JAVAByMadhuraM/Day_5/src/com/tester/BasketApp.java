package com.tester;
import com.classes.*;
import java.util.*;
public class BasketApp {
//String color,double weight,String name,boolean fresh
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of the Basket:");
		fruit basket[]=new fruit[sc.nextInt()];
		System.out.println("");
		for(int i=0;i<basket.length;i++) {
			System.out.println("Enter color :");
			String color=sc.next();
			System.out.println("Enter the Weight : ");
			Double weight=sc.nextDouble();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Is fruit is fresh : ");
			boolean fresh=sc.nextBoolean();
			basket[i]=new Apple(color,weight,name,fresh);
		}
		System.out.println("Display items from the basket:");
		for(fruit f:basket) {
			System.out.println("The items from the basket:"+f);
		}
	}

}
