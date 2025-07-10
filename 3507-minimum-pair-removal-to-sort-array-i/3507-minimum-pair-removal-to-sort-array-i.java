class Solution {
    public int minimumPairRemoval(int[] nums) {
        int count = 0;

        while (!isNonDecreasing(nums)) {
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
            }

            int[] newNums = new int[nums.length - 1];
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (i == minIndex) {
                    newNums[j++] = nums[i] + nums[i + 1];
                    i += 1;
                } else {
                    newNums[j++] = nums[i];
                }
            }

            nums = newNums;
            count += 1;
        }

        return count;
    }

    private boolean isNonDecreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
