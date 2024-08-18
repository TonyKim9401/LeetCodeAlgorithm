class Solution {
    public int longestConsecutive(int[] nums) {

        int output = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) set.add(num);

        for (int num : nums) {
            int idx = 1;
            int count = 1;
            if (!set.contains(num - idx)){
                while (set.contains(num + idx)) {
                    count += 1;
                    idx += 1;
                }
            }
            if (count > output) output = count;
        }
        return output;
    }
}