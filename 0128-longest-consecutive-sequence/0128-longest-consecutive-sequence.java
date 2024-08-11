class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums) -> O(n log n);
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // for (int num : set) {
        //     if (set.contains(num + 1)) {
        //         count += 1;
        //         if (count > max) max = count;
        //     }
        // }

        int max = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int length = 0;
                while (set.contains(num + length)) {
                    length += 1;
                }
                if (length > max) max = length;
            }
        }
        return max;
    }
}