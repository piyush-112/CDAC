
public class numberpattern {
public static void main(String[] args) {
	
	int count=0;
	
	for(int i=0; i<5; i++) {
		for(int j=1; j<=5; j++) {
			++count;
			System.out.print(count+" ");
		}
		System.out.println();
	}
}
}
