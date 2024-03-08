class Solution {
    public int removeDuplicates(int[] nums) {
        int[] result = new int[nums.length];
        
        int temp = nums[0];
        result[0] = temp;
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i]) {
                continue;
            }
            temp = nums[i];
            result[idx] = temp;
            idx++;
        }
        for (int i = 0; i < idx; i++) {
            nums[i] = result[i];
        }
        return idx;
    }
}