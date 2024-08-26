import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int num : nums) {
            if (map.containsKey(num)) continue;

            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);
            int currentLength = left + 1 + right;

            map.put(num, currentLength);

            map.put(num - left, currentLength);
            map.put(num + right, currentLength);

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
