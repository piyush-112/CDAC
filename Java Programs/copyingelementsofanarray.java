
public class copyingelementsofanarray {
public static void main(String[] args) {
	
	int a[] = {1,2,3,4,5,6,7,8,9};
	int b[] = new int[10];
	
//	for(int i=0; i<a.length; i++) {
//		b[i]=a[i];
//		System.out.println(b[i]);
//	}
	
	for(int i=a.length-1; i>=0; i--) {
		b[i]=a[i];
		System.out.println(b[i]);
	}
}
}
