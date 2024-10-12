class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int start = 0;
        int end = 0;
        int count = 0;
        int sum = 0;

        // 0, 0, 0, 0, 0
        while (start < nums.length) {
            end = start;
            sum = 0;
            for (;end < nums.length; end += 1) {
               sum += nums[end];
               if (sum == goal) count += 1;
            }
            start += 1;
        }
        return count;
    }
}