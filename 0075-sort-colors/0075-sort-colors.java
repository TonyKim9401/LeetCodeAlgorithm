class Solution {
    public void sortColors(int[] nums) {
        int j = 0;

        // j = 0
        // value = 1
        // i. j
        // [1, 2, 1]
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                swap(nums, i, j);
                j += 1;
            }

            if (i == nums.length - 1) {
                i = j - 1;
                value += 1;
            }
            if (value == 2) break;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}