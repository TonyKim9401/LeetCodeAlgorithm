class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n+1];

        for (int i = 0; i <= n; i++) {
            output[i] = Integer.bitCount(i);
        }
        return output;
    }
}