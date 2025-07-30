class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>(
            (a, b) -> freq.get(a).equals(freq.get(b))
                ? b.compareTo(a)
                : freq.get(a) - freq.get(b)
        );

        for (String word : freq.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> res = new ArrayList<>();
        while (!heap.isEmpty()) res.add(heap.poll());
        Collections.reverse(res);
        return res;
    }
}