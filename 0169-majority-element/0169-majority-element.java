class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int output = 0;
        int prev = 0;
        for (int key : map.keySet()) {
            int value = map.get(key);
            prev = Math.max(prev, value);
            if (value == prev) output = key;
        }
        return output;
    }
}