class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1) return;
        k %= nums.length;

        int[] rotate = new int[nums.length];


        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            rotate[j++] = nums[i];
        }

        for (int i = 0; i < nums.length - k; i++) {
            rotate[j++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotate[i];
        }
    }
}