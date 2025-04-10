class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                int count = (i + 1) / 3;
                if ((i + 1) % 3 != 0) count += 1;
                return count;
            }
            set.add(nums[i]);
        }

        return 0;
    }
}