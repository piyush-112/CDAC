//Linear Search in java

import java.util.*;
public class LinearSearch{
    public static void main(String x[]){
        try(Scanner sc=new Scanner(System.in)) {
        System.out.println("Enter the size of the Array:");
        int Arr[]=new int[sc.nextInt()];
        System.out.println("Enter the Element into the Array:");
        for(int i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }  
        System.err.println("Enter the element that you want to search:");
        int Ele=sc.nextInt();
        int count=0,index=0;
        //Search the element in the Array in the linear manner
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]==Ele){
                count=1;
                index=i+1;
                break;
        }
    }
        if(count==1){
            System.out.printf("The Element %d is found at position  %d of the array", Ele,index);

        }else{
            System.out.println("Element Not Found");
        }
    
}
}
}
