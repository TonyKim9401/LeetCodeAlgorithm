class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;

        // 최솟값 저장 변수, 
        int min = 5001;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[start] <= nums[mid]) {
                min = Math.min(min, nums[start]);
                start = mid + 1;
            } else if (nums[mid] <= nums[end]) {
                min = Math.min(min, nums[mid]);
                end = mid - 1;
            }
        }
        
        return min;
    }
}