class Solution {
    public int missingNumber(int[] nums) {
        // SC: O(1)
        // TC: O(n)
        // XOR

        int max = nums.length;
        int sum = max * (max+1)/2;

        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}