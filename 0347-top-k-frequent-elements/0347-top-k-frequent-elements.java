class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // O(nlogn)
        // Java internally uses mergesort, quicksort(PriorityQueue)
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 1) + 1);

        // key values from the map
        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList, (o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = keyList.get(i);
        }

        return output;

    }
}