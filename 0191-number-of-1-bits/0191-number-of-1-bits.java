class Solution {
    public int hammingWeight(int n) {
        int output = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) output += 1;
        }
        return output;
    }
}