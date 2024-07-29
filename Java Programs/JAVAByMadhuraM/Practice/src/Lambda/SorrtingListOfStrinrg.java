package Lambda;

import java.util.*;

public class SorrtingListOfStrinrg {
	public static void main(String x[]) {
		List<String> names=Arrays.asList("Ram","Lakshamana","Bharata","Shivaray","Shambhu");
		//sort using lambda expression
		names.sort((a,b)->a.compareTo(b));
		//print sorted list
		names.forEach(System.out::println);
		
	}

	
}
