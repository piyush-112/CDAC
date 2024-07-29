package RandomQue;

import java.util.Scanner;

/*
 s1=abc
 s2=pqr
 output=
 s1=pqr
 s2=abc
 */
public class SwapStrings {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String s1:");
        String s1=sc.next();
        //char str1[]=s1.toCharArray();
        System.out.println("Enter the String s2:");
        String s2=sc.next();
        //char str2[]=s2.toCharArray();
        s1=s1+s2;  //cancate the two string;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("String After the swapping:");
        System.out.println(s1);
        System.out.println(s2);
    }
}
