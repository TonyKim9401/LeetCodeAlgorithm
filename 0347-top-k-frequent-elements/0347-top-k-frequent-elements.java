class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // nums = [1,1,1,2,2,3], k = 2
        // 1, 3
        // 2, 2
        // 3, 1
        
        // O(nlogn)
        // Java internally uses mergesort, quicksort(PriorityQueue)
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count+1);
            } else {
                map.put(num, 1);
            }
        }

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