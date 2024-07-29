package streamAPI;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find the even number from the List
public class streamApp1 {
	public static void main(String []x) {
		// the List interface does remember the insertion 
		//order of elements. Specifically, the ArrayList and LinkedList
//		List<Integer> l1=List.of(10,23,37,44,553,60);
//		System.out.println(l1);
//		
//		List<Integer> l2=new ArrayList<>();
//		l2.add(10);
//		l2.add(60);
//		l2.add(40);
//		l2.add(50);
//		System.out.println(l2);
//		
//		List<Integer> l3=Arrays.asList(55,44,77,88,99);
//		System.out.println(l3);
//		
//		//To get the even number from the list1
//		//create a new List
//		//Without StreamAPI
//		List<Integer> lEven=new ArrayList<>();
//		for(Integer i:l1) {
//			if(i%2==0) {
//				lEven.add(i);
//			}
//		}
//		//List that contain the even number from the list 1
//		System.out.println(lEven);

		//Now we use the Stream API to get the Even number from the List 1:
//		lEven=l1.stream().
//		filter(i->i%2==0).
//		collect(Collectors.toList());
//		System.out.println(lEven);

//		To create the stream objects
		//1-Blank
//		Stream<Object> empStream=Stream.empty();
		
		//2-Array,object,Collection
		List<String> nms=List.of("Ram","Lakshyamana","Shyam","Hanumana","Shivray");
		//Stream<String> s1=Stream.of("Ram","Lakshyamana","Shyam","Hanumana","Shivray");
//		s1.forEach(s->System.out.println(s));
		//I want to print the name who start with using filter method with storing into the new list
		List<String>l2=nms.stream().
		filter(s->s.startsWith("S")).
		collect(Collectors.toList());
		System.out.println(l2);
		
		//start with R without creating the new list
		System.out.println("Using the filter method");
		nms.stream().
		filter(s ->s.startsWith("R")).
		forEach(s -> System.out.println(s));
		
		//declare one list and print the square of each element of the list stored in new list
		System.out.println("Using the map method");
		List<Integer>li=List.of(1,2,3,4,5,6,7,8,9);
		List<Integer> lsq=li.stream().
				          map(i ->i*i).
				          collect(Collectors.toList());
		System.out.println(lsq);
		
		//without creating the new list
		System.out.println("\n");
		li.stream().
		map(i -> i*i).
		forEach(i -> System.out.println(i));
		
		System.out.println("Sort the list using sorted()");
		li.stream().
		sorted().
		forEach(System.out::println);
		
		System.out.println("Using the comparator find the minimun number:");
		Integer lmin=li.stream().
		min((i1,i2) -> i1.compareTo(i2)).
		get();
		System.out.println(lmin);
		
		System.out.println("Find the max using comparator:");
		Integer lmax=li.stream().
				     max((m1,m2) -> m1.compareTo(m2)).
				     get();
		System.out.println(lmax);
	}
}
