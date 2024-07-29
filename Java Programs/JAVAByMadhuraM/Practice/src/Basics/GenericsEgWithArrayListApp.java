package Basics;

import java.util.ArrayList;
import java.util.List;
/*
 * Basically the main objective of the generics are to provide the type safty and to resolve the typecasting 
 * problem ,here is the example;
 */
public class GenericsEgWithArrayListApp {
	public static void main(String x[]) {
		List l=new ArrayList();
		l.add(1);
		l.add("Aniket");
		l.add(23.02);
		System.out.println(l);
		//String s1=(String)l.get(0); //Gives the java.lang.ClassCastException
		//To avoid these type safty problem we use the Generics
		
		List<String> l1=new ArrayList();   //<> we include the type into it like <Integer>,<String>,etc;
		l1.add("Rocket");
		//l1.add(1); //error occured bcz we try to add the int into the string type of the ArryList l1 
		l1.add("Piyush");
		System.out.println(l1);
	}
}
