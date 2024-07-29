//Printing the Array Pairs and also printing the pairs count of the array;
// /To fin dout the tota number if the pairs we have formula  i.e. n(n-1)/2

public class FindArrayPairs {

    public static void printPairs(int Arr[]) {
        int count=0; 
        for (int i = 0; i < Arr.length; i++) {
            int curr = Arr[i];  //  1,4,2,3,5,8
            for (int j = i + 1; j < Arr.length; j++) {
                System.out.printf("(" + curr + "," + Arr[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.println("The total number of the pairs is:"+count);
    }

    public static void main(String[] args) {
        int Arr[] = {1, 4, 2, 3, 5, 8};
        printPairs(Arr);
    }
}
