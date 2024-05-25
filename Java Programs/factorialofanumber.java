import java.util.Scanner;

public class factorialofanumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int fact=1;
//		int sum=0;
//		for(int i=0; i<=n; i++) {
////			System.out.println(i*n);
//			sum = sum+i;
//			System.out.println(sum);
//		}
	
	  for(int i=1; i<=n; i++) {
		  fact = fact*i;
		  
	  }
	  System.out.println(fact);
}
}
