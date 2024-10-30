class Solution {
    public int[] twoSum(int[] nums, int target) {
        // TC: O(n)
        // SC: O(n)
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if (map.containsKey(secondNum)) return new int[]{i, map.get(secondNum)};
            map.put(nums[i], i);
        }

        /* for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        */
        return new int[]{-1,-1};
    }
}