class Solution {
    public int maxProfit(int[] prices) {
        // TC: O(n)
        // SC: O(1)
        
        int maxPrice = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];
            maxPrice = Math.max(maxPrice, prices[i] - minPrice);
        }
        return maxPrice;
    }
}