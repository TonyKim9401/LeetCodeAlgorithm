class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int output = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] - 1 != nums[i-1]) return nums[i] - 1;
        }
        return nums[n - 1] == n? 0 : n;
    }
}