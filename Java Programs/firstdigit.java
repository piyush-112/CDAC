import java.util.*;

public class firstdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(PrintFirst(n));
    }
    public static int PrintFirst(int n){
        while(n>10){
            n=n/10;
        }
        return n;
    }
        


}
