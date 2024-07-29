package RandomQue;
//input of string :NANA
//Output =anan i.e. true
import java.util.Scanner;
public class Anagram {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String s1:");
        String s1=sc.next().toLowerCase();
        char str1[]=s1.toCharArray();
        System.out.println("Enter the String s2:");
        String s2=sc.next().toLowerCase();
        char str2[]=s2.toCharArray();
        if(str1.length==str2.length){
            int count=0;
        for(int i=0;i<str1.length;i++){
            for (int j=0;j<str2.length;j++) {
                if(str1[i]==str2[j]){
                    count++;
                    str2[j]='\0';
                    break;

                }
            }
        }
        if(count==str1.length){
            System.out.println("Given String is Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        }else{
            System.out.println("Given String are not anagram");
        }

    }
}
