package Basics;

import java.util.Scanner;

/*
 * Accept data from User(scanner) & store it in the array.
Display array data using  for loop.
 */
public class ForLoppApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		Double f_Arr[] = new Double[sc.nextInt()];
		// Accepting the Val into f_Arr
		System.out.println("Enter the element into Array:");
		for (int i = 0; i < f_Arr.length; i++) {
			f_Arr[i] = sc.nextDouble();
		}
		// Display the Element using the For loop
		System.out.println("The element of the Array:");
		for (int i = 0; i < f_Arr.length; i++) {
			System.out.printf("%.2f\n", f_Arr[i]);
		}
		sc.close();
	}

}
