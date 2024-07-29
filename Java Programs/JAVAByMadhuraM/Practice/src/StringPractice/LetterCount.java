//i/p=aabbcccc
//o/p=a2b2c4
//this problem calles as String compression
import java.util.*;
public class LetterCount{
    public static String compress(String str){
    StringBuilder sb=new StringBuilder();

    for(int i=0;i<str.length();i++){
        //we use Integer for count bcz after  counting the char we 
        //want to add into the string in output like a3b2c4 like that
        Integer count=1;    
        //This is the main logic of the program
        while(i<str.length()-1 && str.charAt(i) ==str.charAt(i+1)){
            count++;
            i++;
        }
        sb.append(str.charAt(i));  //add normal if there is only one char is there like abc
        if(count >1){
            sb.append(count.toString());
        }
    }
    return sb.toString();
}
    public static void main(String[] args) {
       // String str="aaabbcdderrr";
        String str="abcd";
       System.out.println(compress(str));        
    }
}