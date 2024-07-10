class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        while (n > 0) {
            i += 1;
            n -= i;
        }
        return i - 1;
    }
}