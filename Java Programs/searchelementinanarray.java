import java.util.Scanner;

public class searchelementinanarray {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		int []a= {23,54,57,34,57,353};
		
		System.out.println("Enter an element to search");
		int key = sc.nextInt();
		
		for(int i=0; i<a.length; i++) 
		{
			
			if(key==a[i]) 
			{
				System.out.println("The searched element is" + key);
				
				
			}
			else
				System.out.println("Element not found");
		}
}
}