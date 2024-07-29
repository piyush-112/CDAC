package Lambda;
//Program for printing the table of the given number
import java.util.*;
public class PrintTheTable {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		System.out.println("The Adding the element into the list:");
		for(int i=0;i<num;i++) {
			l.add(sc.nextInt());
		}
		System.out.println(l);
		//printing the table of the number from the list
		
		l.forEach(n->{
			System.out.println("The table of the number:");
			for(int i=1;i<=10;i++) {
				System.out.println(n*i);
			}
			System.out.println();
		});
	}
}
