class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        boolean check = true;
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                check = false;
                output = i;
                break;
            }
        }
        return check ? nums.length : output;
    }
}