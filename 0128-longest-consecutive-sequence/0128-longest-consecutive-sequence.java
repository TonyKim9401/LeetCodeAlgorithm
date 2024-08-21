import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int num : nums) {
            // 이미 처리된 숫자는 무시
            if (map.containsKey(num)) continue;

            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);
            int currentLength = left + 1 + right;

            // 현재 수열의 길이 갱신
            map.put(num, currentLength);

            // 양 끝 수열도 갱신
            map.put(num - left, currentLength);
            map.put(num + right, currentLength);

            // 최대 수열 길이 갱신
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
