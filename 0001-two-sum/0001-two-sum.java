class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1 ; j < nums.length; j++) {
                int nextNum = nums[j];
                if (num + nextNum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}