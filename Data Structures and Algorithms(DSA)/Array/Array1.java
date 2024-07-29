/*
//Implementation Of Operation Array;
1.max
2.min
3.sum(EVEN/ODD)
4.1st largest element
5. second largest element
*/

import java.util.Scanner;
public class Array1{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            
            System.out.println("Enter the size of array");
            int Arr[]=new int[sc.nextInt()];
            //Enter the number into Array
            System.out.println("Enter the element into the array:");
            for(int i=0;i<Arr.length;i++){
                Arr[i]=sc.nextInt();
            }
            for(int i=0; i<Arr.length; i++){
                for(int j=0;j<Arr.length;j++){
                    if(Arr[i]<Arr[j]){
                        int temp=Arr[i];
                        Arr[i]=Arr[j];
                        Arr[j]=temp;
                    }
                }
            }
              //Display the array Ele
            System.out.println("The sorted Array Elements Are:");
            for(int i=0; i<Arr.length; i++){
                 System.out.print(Arr[i]+",");
            }
            int ch=0, evensum=0, oddsum=0;
            
            do{
            System.out.println("\nChoices:"+
            "\n1.Find Max"+
            "\n2.Find min"+
            "\n3.Sum of Even Number"+
            "\n4.Sum of Odd number"+
            "\n5.Second Largest Ele of the Array");
            System.out.println("Enter You choice :");
                switch(sc.nextInt()){
                //case forFind maximum number from the Array
                case 1:
                    System.out.println("The max number is:"+Arr[Arr.length-1]);
                    break;
                case 2:
                    System.out.println("The max number is:"+Arr[0]);
                    break;
                case 3:
                    for(int i=0;i<Arr.length; i++){
                        if(Arr[i]%2==0){
                           evensum+=Arr[i]; 
                        }
                    }
                    System.out.println("Even of array elements is:" +evensum);
                    break;
                case 4:
                    for(int i=0;i<Arr.length; i++){
                        if(Arr[i]%2!=0){
                           oddsum+=Arr[i]; 
                        }
                    }
                    System.out.println("Even of array elements is:" +oddsum);
                    break;
              
                case 5:
                    int secondLarge=Arr[0];
                    int max=Arr[0];
                    for(int i=0;i<Arr.length;i++){
                            if(Arr[i]>max){
                                secondLarge=max;
                                max=Arr[i];
                            }
                            if(Arr[i]>secondLarge && Arr[i]<max){
                                secondLarge=Arr[i];    
                            }
                    } 
                    System.out.println("The Second Large Element of array is:" +secondLarge);
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                }
                System.out.println("Do you want to Continue: 1/0");
                ch=sc.nextInt();
        
            }while(ch==1);
        }
    }
}   