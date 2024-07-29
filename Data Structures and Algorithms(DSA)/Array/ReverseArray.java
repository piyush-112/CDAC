//reverse the array in java
import java.util.Scanner;
public class ReverseArray {
//Function for reverse the Array
    public static void revArray(int Arr[]) {
        int First=0,last=Arr.length-1;
        int temp=Arr[last];
        Arr[last]=Arr[First];
        Arr[First]=temp;
    }
public static void main(String[] args) {
     try(Scanner sc=new Scanner(System.in)){
        int Arr[]=new int[5];
        System.out.println("Enter the Element into the array:");
        for(int i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        //Call and pass the Array to the revArray
        revArray(Arr);
        //Printing the revrse the Array
        for(int i=0;i<Arr.length;i++){
            System.err.printf(Arr[i]+" ");
        }
        System.out.println();
     }
}    
}
