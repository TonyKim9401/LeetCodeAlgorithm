class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n+1];
        int num = 0;
        while (num <= n) output[num] = Integer.bitCount(num++);
        return output;
    }
}