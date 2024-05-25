import java.util.Scanner;

public class displaydigitsofanumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int count=0;
	 while(n>0) {
		 int r=n%10;
		 n=n/10;
		 count++;
		 System.out.println(r);
	 }
	 System.out.println("Total Numbers are" + count);
}
}
