package Recursion;
import java.util.*;
/**
 * Recursion1
 
 */

 public class Recurs1 {
    int count = 0;

    public void print() {
        if (count == 3) return;
        System.out.println(count + "\n");
        count++;
        print();
    }

    public static void main(String[] args) {
        // Create an instance of Recursion1
        Recurs1 obj = new Recurs1();
        // Call the print method on the instance
        obj.print();
    }
}


