class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int dupl = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (dupl == nums[i]) continue;
            nums[j] = nums[i];
            dupl = nums[i];
            j += 1;
        }
        return j;
    }
}