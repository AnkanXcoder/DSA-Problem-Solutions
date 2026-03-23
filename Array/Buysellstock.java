public class Main {
    static int BuySellStocks(int arr[]) {
        int bp = Integer.MAX_VALUE;
        int maxProfit  = 0;
        for(int i=0;i<arr.length;i++) {
            if(bp <  arr[i]) {
                int profit = arr[i] - bp; // today's profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else {
                bp = arr[i];
            }
        }
        
        return maxProfit;
        
        
    }
	public static void main(String[] args) {
	    int arr[] = {7,1,5,3,6,4};
	    System.out.println("max profit is "+BuySellStocks(arr));
	}
}