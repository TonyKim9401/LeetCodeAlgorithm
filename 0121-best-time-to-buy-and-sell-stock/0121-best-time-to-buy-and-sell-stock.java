class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int output = 0;
        for (int price : prices) {
            if (min > price) min = price;
            output = Math.max(output, price - min);
        }
        return output;
    }
}