// import java.util.Scanner;

// public class primefactorization {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(system.in);

//         int n = sc.nextInt();
//         printFactors(n);
//     }
//     public boolean isPrime(int n){
//         for(int i=2; i<n; i++){
//             if(n%i==0){
//                 return false;
//             }
//             return true;
//         }

//         public void printFactors(int n){
//             for(int i=2; i<n; i++){
//                 if(isPrime(i)){
//                     x=i;
//                     while(n%x==0){
//                         System.out.println(i);
//                         x=x*i;
//                     }
//                 }
//             }
//         }
//     }
// }
//usefull
import java.util.Scanner;

public class primefactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printFactors(n);
    }

    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printFactors(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                int x = i;
                while(n%x==0){
                    System.out.println(i);
                    x = x*i;
                    
                }
            }
        }
    }
}
