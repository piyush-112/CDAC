package Basics;
/*
 Question
To print the number representation and radix of a given number.

Input 1 - 1000101011
Output - Number is Binary with Radix=2

Input 2 - 155471
Output - Number is Octal with Radix=8

Input 3 - 1345896
Output - Number is Decimal with Radix=10

Input 4 - 1749A478
Output - Number is Hexadecimal with Radix=16
 */

import java.util.*;
class CheckNumBinOct {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    String num=sc.nextLine();
    System.out.println(num);
    if(num.matches("[01]+")){
        System.out.println("Given number is binary");
    }
    else if(num.matches("[0-7]+")){
        System.out.println("Given number is octal");
    }
    else if(num.matches("[0-9]+")){
        System.out.println("Given number is decimal");
    }
    else if(num.matches("[0-9A-Za-z]+")){
        System.out.println("Given number is the hexadecimal"); // This will print the hexadecimal number if the condition is true
    }
    else{
        System.out.println("Number is negavtive");
    }
}   
}
