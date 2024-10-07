class Solution {
    public int maxSubArray(int[] nums) {
        
        int total = 0;
        int output = nums[0];

        for (int num : nums) {
            total += num;
            output = total > output ? total : output;
            if (total < 0) total = 0;
        }
        return output;
    }
}