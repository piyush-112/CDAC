package Lambda;
// Write a program for the Filtering the list of integer
import java.util.*;
import java.util.stream.Collectors;

public class FilteringIntegerList {
	public static void main(String x[]) {
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Filter the even number from the given above list
		 List<Integer> evenNum = number.stream()
				 					.filter(n->n%2==0)
				 					.collect(Collectors.toList());
		 
		 evenNum.forEach(System.out::println);
				 }			
}
