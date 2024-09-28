class Solution {
    public int maxProfit(int[] prices) {
        int standard = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (standard > prices[i]) {
                standard = prices[i];
                continue;
            }
            maxProfit = Math.max(maxProfit, prices[i] - standard);
        }
        return maxProfit;
    }
}