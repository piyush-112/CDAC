import java.util.Scanner;

public class reverseanumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m=n;
	int rev=0;
	
	while(n>0) {
		int r = n%10;
		rev = rev*10+r;
		n=n/10;
		
	}
	if(rev==m)
	System.out.println("It is a palindrome");
	else {
		System.out.println("Not a palindrome");
	}
}
}
