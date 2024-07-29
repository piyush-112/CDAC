package com.cdac.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileTester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in); // Scanner for user input
             BufferedReader in = new BufferedReader(new FileReader("customer.txt"))) { // BufferedReader for reading file

            List<String[]> list = new ArrayList<>(); // ArrayList to store data from file

            String s = in.readLine(); // Read the first line (header)
            while (s != null) { // Read each line of the file
                String[] str = s.split(","); // Split the line by comma
                list.add(str); // Add the split line to the list
                s = in.readLine(); // Read the next line
            }

            list.remove(0); // Remove the header row

            // Calculate the sum of the fourth column (index 3)
            double sum = list.stream().mapToDouble(v -> Double.parseDouble(v[3])).sum();
            System.out.println("Sum : " + sum);

            // Find the maximum value in the fourth column
            double max = list.stream().mapToDouble(v -> Double.parseDouble(v[3])).max().orElseThrow();
            System.out.println("Maximum : " + max);

            // Calculate the sum of the third column for rows where the second column is "Shopping"
            double sumShopping = list.stream().filter(v -> v[1].equals("Shopping"))
                    .mapToDouble(v -> Double.parseDouble(v[2])).sum();
            System.out.println("Shopping Expense :" + sumShopping);

            // Find the row(s) where the third column is equal to the maximum value in that column
            // and print the first column (Date)
            list.stream().filter(l -> ((Double) Double.parseDouble(l[2])).equals(list.stream().mapToDouble(v -> Double.parseDouble(v[2])).max().orElseThrow()))
                    .forEach(v -> System.out.println("Date :" + v[0]));

        } catch (Exception e) {
            System.out.println(e.toString()); // Print any exceptions
        }
    }
}