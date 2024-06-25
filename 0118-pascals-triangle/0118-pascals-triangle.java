class Solution {
    private List<List<Integer>> dp = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        // dp
        dp.add(List.of(1));
        if (numRows == 1) return dp;
        dp.add(List.of(1,1));
        if (numRows == 2) return dp;

        for (int i = 3; i <= numRows; i++) {
            List<Integer> up = dp.get(i - 2);
            List<Integer> inside = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    inside.add(1);
                    continue;
                }
                inside.add(up.get(j - 1) + up.get(j));
            }
            dp.add(inside);
        }
        return dp;
    }
}