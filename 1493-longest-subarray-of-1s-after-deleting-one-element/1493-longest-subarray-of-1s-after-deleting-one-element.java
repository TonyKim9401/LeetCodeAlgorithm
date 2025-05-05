class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int output = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount += 1;
            }

            if (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount -= 1;
                }
                left += 1;
            }

            output = Math.max(output, right - left);
        }

        return output;
    }
}
