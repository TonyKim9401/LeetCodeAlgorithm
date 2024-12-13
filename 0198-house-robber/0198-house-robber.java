class Solution {
    public int rob(int[] nums) {
        int output = 0;
        int temp = 0;
        // current 1 2 4 4
        // output  1 2 4 4
        // temp.   0 1 2 4
        for (int i = 0; i < nums.length; i++) {
            int current = Math.max(output, temp + nums[i]);
            temp = output;
            output = current;
        }

        return output;
    }
}