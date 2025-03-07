class Solution {
    public int maxProfit(int[] prices) {
        int output = 0;
        int current = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (current > prices[i]) {
                current = prices[i];
            } else {
                output += prices[i] - current;
                current = prices[i];
            }
        }
        return output;
    }
}