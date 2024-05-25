import java.util.Scanner;

public class sumofanarray {
	public static int sum(int []arr)
	{
		int sum = 0;
		int i;
		
		for(i=0; i<arr.length; i++)
			sum=sum+arr[i];
		
		return sum;
	}
	
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int arr[] = {12,3,4,15};
	System.out.println("Sum of given array is" + sum(arr));
	
	
}
}
