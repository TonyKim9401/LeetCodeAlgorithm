class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // key: array elements, value: how often it is showed in the given array
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // the num has already been found
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count+1);
            // have never found the key value
            } else {
                map.put(num, 1);
            }
        }

        // sort hashmap by using its value
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if (o1.getValue() == o2.getValue()) {
                return o2.getKey() - o1.getKey();
            } else {
                return o2.getValue() - o1.getValue();
            }
        }); // descending

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = list.get(i).getKey();
        }

        return output;
    }
}