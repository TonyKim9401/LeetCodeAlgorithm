class Solution {
    public long maximumTripletValue(int[] nums) {
        long output = 0;

        int[] rightMax = new int[nums.length];
        int rightVal = nums[nums.length-1];

        for (int i = nums.length - 1; i >= 0; i--) {
            rightVal = Math.max(rightVal, nums[i]);
            rightMax[i] = rightVal;
        }
        // [12,7,7,7,7]
        
        int leftVal = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            int curVal = nums[i];
            if (leftVal > curVal) {
                System.out.println(leftVal + " " + curVal + " " + rightMax[i + 1]);
                long newMax = (long)(leftVal - curVal)*rightMax[i + 1];
                output = Math.max(output, newMax);
            } else {
                leftVal = curVal;
            }
        }

        return output;
    }
}