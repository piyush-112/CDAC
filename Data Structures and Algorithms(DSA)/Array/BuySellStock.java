public class BuySellStock {
    public static int buyandsellStock(int Prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<Prices.length;i++){
            if(buyprice<Prices[i]){  //profit
                int profit=Prices[i]-buyprice;  //todays profit
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=Prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int Price[]={1,9,77,3,66,4,99};
        System.err.println(buyandsellStock(Price));
    }
}
