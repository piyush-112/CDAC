
public class shiftingarrayelements {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,6,7,8,9};
	
	int temp=a[0];
	
	for( int i=1; i<=a.length-1; i++) {
		
		a[i-1]=a[i];
		System.out.println(a[i-1]);
	}
	a[a.length-1]=temp;
	System.out.println(a[a.length-1]);
}
}
