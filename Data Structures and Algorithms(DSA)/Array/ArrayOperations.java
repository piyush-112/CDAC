public class ArrayOperations {

    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40, 50};
        //   displayArray(arr);

        //   arr = addElementEnd(arr, 60);
        //    displayArray(arr);

        //   arr=  addElementToPosition(arr,100,5);

        //   arr = rightShift(arr, 2);
 
        arr = leftShift(arr, 1);
        displayArray(arr);
    }

    public static int[] deleteElement(int[] arr, int element) {

        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {
                   int index=i;
                   arr[i]=arr[i+1];

            }
        }
        return arr;
    }


    public static int[] rightShift(int arr[], int times) {
        for (int j = 0; j < times; j++) {
            int last = arr[arr.length - 1];
            int i = arr.length - 1;
            while (i > 0) {
                arr[i] = arr[--i];
            }
            arr[i] = last;
        }
        return arr;
    }

    public static int[] leftShift(int arr[], int times) {
        int counter = 0;

        while (counter < times) {
            int first = arr[0];
            int i = 1;
            for (i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[i - 1] = first;
            counter++;
        }
        return arr;
    }


    public static int[] addElementToPosition(int arr[], int element, int indexPosition) {

        int[] newArray = new int[arr.length + 1];
        copyElement(arr, newArray);
        int i = newArray.length - 1; //7
        while (i >= indexPosition) {
            newArray[i] = newArray[--i];
        }
        newArray[i] = element;

        return newArray;
    }

    public static int[] addElementEnd(int arr[], int element) {
        int newSize = arr.length + 1;

        int[] arr1 = new int[arr.length];
        arr1 = arr;
        arr = new int[newSize];
        copyElement(arr1, arr);
        arr[newSize - 1] = element;
        return arr;
    }


    private static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println("");

    }

    private static void copyElement(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}