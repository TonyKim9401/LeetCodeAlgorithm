class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (j > 1 && nums[i] == nums[j-1] && nums[i] == nums[j-2]) continue;
            nums[j] = nums[i];
            j += 1;
        }
        return j;
    }
}