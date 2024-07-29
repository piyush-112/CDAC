
//Print the maximum sum of the Sub array that are formed from the given array:
public class MaxSubArraySum {
    public static void maxsubarrsum(int Arr[]) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<Arr.length;i++){
            int start=i;
            for(int j=i;j<Arr.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    //print sub arry sum
                    currsum+=Arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("The maximum sum of the sub Array is: "+maxsum);
    }
    public static void main(String[] args) {
        int Arr[]={2,3,5,9,8};
        maxsubarrsum(Arr);
    }
}
