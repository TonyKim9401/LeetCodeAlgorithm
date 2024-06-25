class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) buy = prices[i];
            else if (prices[i] - buy > profit) profit = prices[i] - buy;
        }
        return profit;
    }
}