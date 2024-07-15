class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int output = 0;

        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (i != nums[i]) {
                check = true;
                output = i;
                break;
            }
        }
        return check ? output : n;
    }
}