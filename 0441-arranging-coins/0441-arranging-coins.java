class Solution {
    public int arrangeCoins(int n) {
        int output = 0;
        int level = 1;
        while (level <= n) {
            output += 1;
            n -= level;
            level += 1;
        }
        return output;
    }
}