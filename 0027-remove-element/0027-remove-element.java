class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;
            nums[idx] = nums[i];
            idx += 1;
        }
        return idx;
    }
}