package Basics;

import java.util.Scanner;

public class FindtheEleoftheFibo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int f = 1, s = 1, t = 0;
        int n = sc.nextInt(); // Read the value of 'n' only once
        int[] arr = new int[n]; // Declare the array outside the loop
        for (int i = 0; i < n; i++) {
            t = f + s;
            f = s;
            s = t;
            arr[i] = s;
        }
        
        System.out.println(arr[n-1]);
	}

}

