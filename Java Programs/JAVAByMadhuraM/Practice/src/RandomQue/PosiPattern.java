package RandomQue;
/*
I/p:
 num=5
 arr={1,2,-8,-9,7}
 O/p=
 arr={1,-8,2,-9,7}
 */

 import java.util.ArrayList;
import java.util.Scanner;
class PosiPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter the Element into the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //Lets Implement the logic 
        //Create the two arrayList to store the positive and negative element of the array
        ArrayList<Integer>posi=new ArrayList<>();  //Arraylist tfor storing the positive num 
        ArrayList<Integer>nega=new ArrayList<>();  //Arraylist tfor storing the negative num

        //Lets add the element into it
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posi.add(arr[i]);
            }
            if(arr[i]<0){
                nega.add(arr[i]);
            }
        }
        
        int index=0,positive=0,negative=0;

        ///If the postive and negative number of the array varies
        while(positive<posi.size() && negative<nega.size()){
            arr[index++]=posi.get(positive++);
            arr[index++]=nega.get(negative++);
        }
        while(positive<posi.size()){
            arr[index++]=posi.get(positive++);
        }

        while(positive<posi.size()){
            arr[index++]=nega.get(negative++);  
        }

        //Lets pritn the output
        System.out.println("The array is :");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
 }
    