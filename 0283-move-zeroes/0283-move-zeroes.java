class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != 0) {
                j += 1;
                continue;
            }
            if (nums[i] == 0 && nums[j] == 0) continue;
            if (nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j += 1;
            }
        }
    }
}