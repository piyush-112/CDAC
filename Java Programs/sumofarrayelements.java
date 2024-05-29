
public class sumofarrayelements {
	public static void main(String[] args) {
		
		int a[]= {3,9,7,8,12,6,15,5,4,10};
		int sum=0;
		int key=12;
		int max=0;
		int max1=a[0];
		int max2=a[0];
		
		for(int i=0; i<a.length; i++) {
			
//			if()
//			sum=sum+a[i];
//			if(key==a[i]) {
//				System.out.println("Element Found is" + a[i]);
			
			if(a[i]>max1) {
				max2=max1;
				max=a[i];
				
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
			
			
		}
		System.out.println("Second largest element is" +max2);
		
//		System.out.println(sum); 
	}
}
