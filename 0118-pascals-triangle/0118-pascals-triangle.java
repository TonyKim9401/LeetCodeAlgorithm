class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(List.of(1));
        if (numRows == 1) return output;

        for (int i = 1; i < numRows; i++) {
            long prev = 1;
            List<Integer> inside = new ArrayList<>();
            inside.add(1);
            for (int j = 1; j <= i; j++) {
                long nextVal = prev * (i - j + 1) / j;
                inside.add((int)nextVal);
                prev = nextVal;
            }
            output.add(inside);
        }
        return output;
    }
}