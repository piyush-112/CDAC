package Lambda;
//Write a programs for calculating the square of the number

//Used the lambda Exp

import java.util.*;

public class CalSquareNum {
	public static void main(String args[]) {
	List<Integer> num=Arrays.asList(1,2,3,4,5,6);
	
	//Calculating the square of the number
	num.forEach(n -> System.out.println(n * n));
	}
}
