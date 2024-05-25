import java.util.Scanner;

public class averageofanarray {
	public static int average(int []a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
		sum = sum + a[i];
	}
		int avg = sum/a.length;
		return avg;
	}
	
	
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int arr[] = new int [n];
	
	for(int i=0; i<n; i++) {
		arr[i] = sc.nextInt();
		
	}
	System.out.println("The average of the numbers is" + average(arr));
}
}
