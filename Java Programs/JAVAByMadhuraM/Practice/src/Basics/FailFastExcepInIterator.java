package Basics;

import java.util.*;

public class FailFastExcepInIterator {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		List<Integer> al=new ArrayList<>();
		System.out.println("Enter the no of element that you want to add into the List:");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			al.add(i);
		}
		
		//Apply the iterator on the List:
		Iterator<Integer> itr=al.iterator();
//		System.out.println("Enter the index from you want to remove the element:");
//		int index=sc.nextInt();
//		al.add(1234);       //java.util.ConcurrentModificationException i.e. Failfast Exception in Iteratorss
		while(itr.hasNext()) {   //how tp print the actual data using the iterator
			Integer ele=itr.next();  //upcasting   
			System.out.println(ele);
		}
		}
	//sc.close();

}
