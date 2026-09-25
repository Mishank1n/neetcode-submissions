class Solution {
    public static int maxProfit(int[] prices) {
        int L = 0;
        int R = 1;
        int maxProfit = 0;
        while(R<prices.length){
            if (prices[R]<=prices[L]){
                L++;
                R = L+1;
            } else {
                maxProfit = Math.max(maxProfit, prices[R] - prices[L]);
                R++;
            }
        }
        return maxProfit;
    }
}