class Solution {
    public int maxProfit(int[] prices) {
        int prevProfit = prices[0];
        int output = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prevProfit > prices[i]) prevProfit = prices[i];
            output = Math.max(output, prices[i] - prevProfit);
        }

        return output;
    }
}