class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int rowPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (rowPrice > prices[i]) {
                rowPrice = prices[i];
            }
            max = Math.max(prices[i] - rowPrice, max);
        }

        return max;
    }
}