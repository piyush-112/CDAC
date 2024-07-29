// Implementing the selection sort
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];  //11
            int prev = i - 1;   //12
            // Move elements of arr[0..i-1], that are greater than curr, to one position ahead of their current position
            //Finding out the correct position to insert 
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev -= 1;  //index --
            }
            //Insertion
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array using Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
