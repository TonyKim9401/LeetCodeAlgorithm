class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> output = new ArrayList<>();
        output.add(0);
        for (int i = 0; i < n; i++) {
            int size = output.size();
            for (int j = size - 1; j >= 0; j--) {
                int inside = output.get(j) + (1 << i);
                output.add(inside);
            }
        }
        return output;
    }
}