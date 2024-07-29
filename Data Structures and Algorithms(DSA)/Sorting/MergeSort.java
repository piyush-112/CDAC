//Implementing the MergeSort

import java.util.Scanner;
public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2; 
            // Sort first and second halves
            mergeSort(arr, l, m);    //parr1
            mergeSort(arr, m + 1, r);   //2nd part

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        // Sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays
        int[] L = new int[n1];   //for part 1  left
        int[] R = new int[n2];   //for part 2  right

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the Size of the Array:");
            int n=sc.nextInt();
            //input the element into the Array
            int[] arr=new int[n];
            System.out.println("Enter the Element of the Array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                }
                //call the mergeSort method
                mergeSort(arr, 0, arr.length - 1);
                System.out.println("Sorted array using Merge Sort:");
                for (int num : arr) {
                    System.out.print(num + " ");
                    }      
        }
    }
}
