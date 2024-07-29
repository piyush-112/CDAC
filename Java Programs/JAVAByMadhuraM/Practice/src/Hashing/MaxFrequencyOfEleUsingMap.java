package Hashing;
//To print the highest occured element from the array ,we use the map for it

import java.util.*;
public class MaxFrequencyOfEleUsingMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int arr[]=new int[sc.nextInt()];   //Taking i/p from user and creat the new Array
		System.out.println("Enter the element into the Array:");
		for(int i=0;i<arr.length;i++) {          //Accepting the element into the Array;
			arr[i]=sc.nextInt();
		}
		//create the map from given Array:
		Map<Integer, Integer> freq=new HashMap<>();
		for(int a:arr) {
				if(!freq.containsKey(a)) {
					freq.put(a,1);
				}
				else {
					freq.put(a,freq.get(a)+1);
				}
		}
		System.out.println("Frequency Map: Element = Occurence");
		System.out.println(freq.entrySet());
		int maxfreq=0, anskey=0;
		for(int key:freq.keySet()) {
			if(freq.get(key)>maxfreq) {
				maxfreq=freq.get(key);
				anskey=key;
			}
		}
		System.out.printf("%d has Maximum frequency nd it occure %d times:",anskey,maxfreq);
		sc.close();
	}

}
