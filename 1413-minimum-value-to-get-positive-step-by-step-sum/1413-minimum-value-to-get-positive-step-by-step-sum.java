class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minPrefix = 0;

        for (int num : nums) {
            prefixSum += num;
            minPrefix = Math.min(minPrefix, prefixSum);
        }

        return 1 - minPrefix;
    }
}
