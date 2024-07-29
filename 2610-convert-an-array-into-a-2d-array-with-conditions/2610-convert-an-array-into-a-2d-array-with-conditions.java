class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                int value = map.get(num);
                map.put(num, value+1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        // 1 : 3
        // 3 : 2
        // 4 : 1
        // 2 : 1
        for (int num : nums) {
            int value = map.get(num);
            for (int i = 0; i < value; i++) {
                try {
                    List<Integer> inside = output.get(i);
                    inside.add(num);
                } catch (IndexOutOfBoundsException e) {
                    List<Integer> inside = new ArrayList<>();
                    inside.add(num);
                    output.add(inside);
                }
            }
        }
        return output;
    }
}