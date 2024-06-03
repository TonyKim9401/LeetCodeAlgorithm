import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return map.get(target);
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}