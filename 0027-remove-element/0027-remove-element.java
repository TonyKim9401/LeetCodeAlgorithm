class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int count = 0;

        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = nums[end];
                end -= 1;
                continue;
            }
            count += 1;
        }

        return count;
    }
}