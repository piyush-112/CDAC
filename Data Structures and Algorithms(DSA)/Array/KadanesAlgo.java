//Implementing the Kadanes Algorithm For finding the Max Sum of the SubArray

public class KadanesAlgo {
public static void MaxSum(int Arr[]){
int currsum=0;
int maxsum=0;

for(int i=0;i<Arr.length;i++){
    currsum+=Arr[i];
    if(currsum < 0){
        currsum=0;
    }
    maxsum=Math.max(currsum,maxsum);
}
System.out.println("Max SubArray Sum is:"+maxsum);
}
public static void main(String[] args) {
    int Arr[]={1,2,3,4,5,-1,-3};
    MaxSum(Arr);
}
}
