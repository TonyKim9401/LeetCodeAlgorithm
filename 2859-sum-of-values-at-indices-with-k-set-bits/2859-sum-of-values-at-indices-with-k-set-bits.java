class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int output = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) output += nums.get(i);
        }
        return output;
    }
}