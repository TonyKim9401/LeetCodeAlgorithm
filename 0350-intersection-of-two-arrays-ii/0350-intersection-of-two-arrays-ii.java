class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                int value = map.get(num);
                if (value > 0) {
                    list.add(num);
                    map.put(num, value - 1);
                }
            }
        }

        int[] output = new int[list.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = list.get(i);
        }
        return output;
    }
}