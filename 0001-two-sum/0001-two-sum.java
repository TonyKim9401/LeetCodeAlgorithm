class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n^2)
        // [2,7,11,15]
        // target - element = 7;
        // 2 : [1, 5]
        // 7 : 2
        // 11 : 3
        // 15 : 4

        // put all elements into the map
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> inside = map.get(nums[i]);
                inside.add(i);
                map.put(nums[i], inside);
            } else {
                List<Integer> inside = new ArrayList<>();
                inside.add(i);
                map.put(nums[i],inside);
            }
        }

        // [2,2]
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (second == nums[i] && map.get(nums[i]).size() > 1) {
                List<Integer> inside = map.get(nums[i]);
                return new int[]{inside.get(0), inside.get(1)};
            } else if (map.containsKey(second) && second != nums[i]){
                List<Integer> inside = map.get(second);
                return new int[]{i, inside.get(0)};
            }
        }
        return new int[]{-1, -1};
    }
}