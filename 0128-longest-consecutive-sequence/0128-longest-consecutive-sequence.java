class Solution {
    public int longestConsecutive(int[] nums) {
        // Time complexity = O(n)
        // Space complexity = O(n)
        
        int output = 0;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            int count = 1;
            if (!set.contains(num - count)) {
                while (set.contains(num + count)) {
                    count += 1;
                }
            }
            output = Math.max(output, count);
        }

        return output;
    }
}