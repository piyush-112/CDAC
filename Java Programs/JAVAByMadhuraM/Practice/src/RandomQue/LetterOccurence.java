package RandomQue;
/*
Program to find the letter Occurence;
 input:
 str=Ram
 output
 R=1
 a=1
 m=1
 */
import java.util.HashMap;
import java.util.Scanner;
public class LetterOccurence {
    public static void main(String x[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the string:");
            String s1=sc.nextLine();
            char str[]=s1.toCharArray();
    //         for(int i=0;i<str.length;i++){
    //             int count=1;
    //             for(int j=0;j<str.length;j++){
    //             if(str[i]==str[j]){
    //                 count++;
    //             }
    //         }
    //         System.out.println(str[i]+" Occurs "+count);
    //         }
    //     }

    //lets do it using the hashMap
        HashMap<Character,Integer> EleOccur=new HashMap<>();
        for(char c:str){
            EleOccur.put(c, EleOccur.getOrDefault(c,0)+1);
        }
        /* 
         The getOrDefault method is used to retrieve the value 
         associated with a specific key from the HashMap. If the key is not 
         present, it returns a default value. 
         */

         //print the occurence
         for(char c:EleOccur.keySet()){
                System.out.println(c+"Occurs "+EleOccur.get(c)+" times");  
         }
    }
} 
}
