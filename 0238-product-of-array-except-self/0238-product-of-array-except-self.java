class Solution {
    public int[] productExceptSelf(int[] nums) {
        // O(n), no division operation
        // nums  = [3,2,4,5]
        // prefixsum = [0,3,5,9]
        // suffixsum = [11,9,5,0]
        // each elements value are less than Long.MAX_VALUE

        // [1, 2, 3, 4]
        // prefix multi [1, 1, 2, 6]
        // suffix multi [24, 12, 4, 1]

        // solve this problem within 60 mints
        // study merge and quick sort
        int left = 1;
        int[] pSum = new int[nums.length];
        pSum[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pSum[i] = left * nums[i-1];
            left = pSum[i];
            System.out.print(left + " ");
        }

        int right = 1;
        int[] sSum = new int[nums.length];
        sSum[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            sSum[i] = right * nums[i + 1];
            right = sSum[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = pSum[i] * sSum[i];
        }
        return nums;
    }
}