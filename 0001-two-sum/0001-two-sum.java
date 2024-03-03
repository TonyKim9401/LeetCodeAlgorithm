import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int restValue = target - nums[i];
            if (numMap.containsKey(restValue) && numMap.get(restValue) != i) {
                return new int[]{i, numMap.get(restValue)};
            }
        }

        return new int[]{};
    }
}