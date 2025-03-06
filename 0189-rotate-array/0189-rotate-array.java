class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1) return;
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right -= 1;
            left += 1;
        }
    }
}