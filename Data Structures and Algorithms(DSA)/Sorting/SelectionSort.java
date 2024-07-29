//Implement the Selection sort using the java

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;  //Assing min index
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_index]) {     //Finding the index of the minimum value 
                    min_index = j;           
                } 
            }
            
            // Swap arr[i] and arr[min_index]
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array using Selection Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

