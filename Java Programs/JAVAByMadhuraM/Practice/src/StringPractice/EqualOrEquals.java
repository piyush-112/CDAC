//To check the working of the == and equals in string

public class EqualOrEquals{
    public static void main(String[] args) {
       String str1="Ram";
        String str2="Ram";
        String str3=new String("Ram");

        if(str1 ==str2){     //== chack at the object level
            System.out.println("Strings are equals");
        }else{
            System.out.println("Strings are not equals");
        }
        
        //Here we create the string using new keyword thats why they show not equal
        //to overcome this problem we use the .equals method
        /* 
        if(str2==str3){
            System.out.println("Strings are equals");
        }else{
            System.out.println("Strings are not equals");
        }
        */

        if(str2.equals(str3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}