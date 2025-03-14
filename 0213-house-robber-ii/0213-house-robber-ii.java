class Solution {
    public int rob(int[] nums) {
        int length = nums.length - 1;
        if (length == 0) return nums[length];

        int fromFirst = getMoney(nums, 0, length - 1);
        int fromSecond = getMoney(nums, 1, length);

        return Math.max(fromFirst, fromSecond);
    }

    private int getMoney(int[] nums, int start, int end) {
        int prevOne = 0;
        int prevTwo = 0;

        for (int i = start; i <= end; i++) {
            int temp = prevOne;
            prevOne = Math.max(prevOne, prevTwo + nums[i]);
            prevTwo = temp;
        }
        return prevOne;
    }
}