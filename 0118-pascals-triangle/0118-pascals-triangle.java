class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> inside;

        inside = new ArrayList<>();
        inside.add(1);
        output.add(inside);
        if (numRows == 1) return output;

        inside = new ArrayList<>();
        inside.add(1);
        inside.add(1);
        output.add(inside);
        if (numRows == 2) return output;

        for (int i = 2; i < numRows; i++) {
            inside = new ArrayList<>();
            inside.add(1);
            
            List<Integer> prev = output.get(i-1);
            for (int j = 1; j < i; j++) {
                inside.add(prev.get(j-1) + prev.get(j));
            }

            inside.add(1);
            output.add(inside);
        }
        return output;
    }
}