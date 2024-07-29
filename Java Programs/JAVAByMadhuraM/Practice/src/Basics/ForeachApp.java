package Basics;

import java.util.Scanner;

/*
 *for-each limitations
1. Can only iterate from 1st elem to last elem , with step size +1
2. Works on a copy of array elems
(can't be used for modifying array elems).
 * Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.
 */
public class ForeachApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:"); // Accepting the size of the array
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the Element into the Array:"); // Accepting the element into the Array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Use for-each loop for displaying the element
		System.out.println("The Element of the array:");
		for (int a : arr) {
			System.out.printf("%d\n", a);
		}
		sc.close();
	}

}
