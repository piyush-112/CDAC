import java.util.*;
public class findfirstdigit {
    
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       
        System.out.println(printFirst(n));
    }
    public static int printFirst(int n){
        while(n>10){
            n=n/10;
        }
        return n;
    }
}
