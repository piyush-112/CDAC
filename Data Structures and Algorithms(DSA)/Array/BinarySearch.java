//Binary search in java
public class BinarySearch{
    public static int BinarySea(int Arr[],int key){
        int start=0,end=Arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;

            //Comparision
            if(Arr[mid] == key){  //found
                return mid;
            }
            if(Arr[mid]<key){ //right
                start=mid+1;
            }else{            //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Arr[]={10,20,80,90,110,188};
        int ele=110;
        System.out.println("The index for our key is:"+BinarySea(Arr, ele));
    }   
}