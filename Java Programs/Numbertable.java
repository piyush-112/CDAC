import java.util.*;

public class Numbertable{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int range=10;
        int i=1;
        //using the for loop
        for(int i=0;i<=10;i++){
         System.out.println("The table of" + num + " is" + i*num);
        }
        // while(i<=range){
        // System.out.println("The table of" + num + " is" + i*num);
        // i++;
    }
}
}
