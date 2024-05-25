
public class stringclass {
public static void main(String[] args) {
	 
	String str11 = "Java Program";
			System.out.println(str11);
			
	String str21= new String("Java Program");
	System.out.println(str21);
	
	char c[]= {'H','E','L','L','O'};
	String str3=new String(c,1,2);
	System.out.println(str3);
	
	
	String str1="Java";
	String str2=new String("Java");
	
	if(str1==str2) {
	System.out.println("true");
	}
	else{System.out.println("false");
	}
}
}
