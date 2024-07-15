class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int output = 0;
        for (int i = 0; i < nums.length-1; i++) {
            output = output > nums[i+1] - nums[i] ? output : nums[i+1] - nums[i];
        }
        return output;
    }
}