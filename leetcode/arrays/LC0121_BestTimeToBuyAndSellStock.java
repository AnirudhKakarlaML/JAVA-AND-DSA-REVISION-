public class LC0121_BestTimeToBuyAndSellStock {
    class Solution {
    public int maxProfit(int[] prices) {
        int minidx = 0;
        int profit_1 = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[minidx] > prices[i]){
                minidx = i;
            }
            int profit = prices[i] - prices[minidx];
            if(profit>profit_1){
                profit_1 = profit;
            }
        }
        return profit_1;
    }
}
    
}
