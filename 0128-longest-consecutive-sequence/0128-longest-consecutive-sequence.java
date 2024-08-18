class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums) -> O(n log n);
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int max = 0;
        for (int num : set) {
            int idx = 1;
            int count = 1;
            if (!set.contains(num - idx)) {
                while (set.contains(num + idx)) {
                    count += 1;
                    idx += 1;
                }
                if (count > max) max = count;
            }
        }
        return max;
    }
}