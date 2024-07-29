
public class PrefixSum {

    public static void maxsubarraysum(int Arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[Arr.length];

        prefix[0] = Arr[0];
        //Calculate prefix array

        for (int i = 1; i < Arr.length; i++) {
            prefix[i] = prefix[i - 1] + Arr[i];
        }

        for (int i = 0; i < Arr.length; i++) {
            int start = i;
            for (int j = i; j < Arr.length; j++) {
                int end = j;
                currsum = 0;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum is:" + maxsum);
    }

    public static void main(String[] args) {
        int Arr[] = {4, 5, 6, 9, 8, -7};
        maxsubarraysum(Arr);
    }
}
