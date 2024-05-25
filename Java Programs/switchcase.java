import java.util.Scanner;

public class switchcase {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a choice");
	int choice=sc.nextInt();

	switch(choice) {
	case 1: System.out.println("1");
	break;
	case 2: System.out.println("2");
	break;
	
	default: System.out.println("Enter a valid number");
	}
}
}
