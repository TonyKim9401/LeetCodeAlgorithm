class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count + 1);
                if (count + 1 > maxCount) maxCount = count + 1;
            } else {
                map.put(num, 1);
            }
        }
        for (int num : map.keySet()) {
            if (maxCount == map.get(num)) return num;
        }
        return -1;
    }
}