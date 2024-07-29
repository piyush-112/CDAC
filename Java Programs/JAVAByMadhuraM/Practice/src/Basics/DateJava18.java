package Basics;
import java.time.LocalDate;
import java.util.*;
public class DateJava18 {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		//LocalDate ld=new LocalDate(int year, int month, int dayOfMonth);
		LocalDate curDate=LocalDate.now();
		System.out.println("The current date is:"+curDate);
	}
}
