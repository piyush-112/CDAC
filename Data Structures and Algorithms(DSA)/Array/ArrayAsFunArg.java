//Pass Array as the  Argument to the Function
public class ArrayAsFunArg{
    public static void updatemarks(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String x[]){
        int marks[]={80,90,8,99,86};
        updatemarks(marks);
        //printing the Array;
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}