class Solution {
    public int[] searchRange(int[] nums, int target) {
        // binary search
        int start = 0;
        int end = nums.length - 1;
        int[] output = new int[2];
        output[0] = -1;
        output[1] = -1;

        if (nums.length == 0) return output;

        // get start value
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midVal = nums[mid];

            if (midVal == target) {
                output[0] = mid;
                end = mid - 1;
            } else if (midVal > target) end = mid - 1;
            else start = mid + 1;
        }

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midVal = nums[mid];

            if (midVal == target) {
                output[1] = mid;
                start = mid + 1;
            } else if (midVal < target) start = mid + 1;
            else end = mid - 1;
        }

        return output;
    }
}