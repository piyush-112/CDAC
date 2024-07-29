package Basics;

import java.util.*;

public class ArrayListEgApp {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		//create a ArrayList to check its size;
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter the number that you want to add into the arrayList:");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			al.add(i);
		}
		
//		for(int i: al) {
//			al.add(i);
//		}
		System.out.println(al.size());
	}
}
