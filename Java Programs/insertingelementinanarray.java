
public class insertingelementinanarray {
public static void main(String[] args) {
	
	int a[]= new int[10];
	int n= 6;
	int x=15;
	int index=2;
	int i;
	a[0]=5;
	a[1]=9;
	a[2]=6;
	a[3]=10;
	a[4]=12;
	a[5]=7;
	
	for(i=n; i>index; i--) {
		a[i] = a[i-1];
		
	}
	a[index]=x;
	System.out.println(a[i]); 
	
}
}
