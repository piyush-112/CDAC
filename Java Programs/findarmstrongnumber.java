import java.util.Scanner;

public class findarmstrongnumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int m=n;
	int sum=0;
	
	while(n>0) {
		int r=n%10;
		n=n/10;
		sum=sum+r*r*r;
		
	}
	if(sum==m) {
		System.out.println("Number is armstrong number");
	}
	else {
		System.out.println("Not a armstrong number");
	}
}
}
