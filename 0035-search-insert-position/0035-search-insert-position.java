class Solution {
    public int searchInsert(int[] nums, int target) {
        
        // the rowest
        if (target < nums[0]) return 0;
        
        // the highest
        if (target > nums[nums.length-1]) return nums.length;
        
        int start = 0;
        int end = nums.length - 1;
        int result = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int number = nums[mid];
            
            if (number == target) {
                result = mid;
                break;
            } else if (number < target) {
                if (target < nums[mid+1]) {
                    result = mid + 1;
                    return result;
                }
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}