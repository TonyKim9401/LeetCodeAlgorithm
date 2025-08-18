class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, false);
            } else {
                map.put(num, true);
            }
        }

        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key)) {
                sum += key;
            }
        }

        return sum;
    }
}