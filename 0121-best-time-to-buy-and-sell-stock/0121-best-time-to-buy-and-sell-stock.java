class Solution {
    public int maxProfit(int[] prices) {
        int output = 0;
        
        int low = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (low > prices[i]) low = prices[i];
            else output = Math.max(output, prices[i] - low);
        }
        return output;
    }
}