class Solution {
    public List<Integer> getRow(int rowIndex) {
        // rowIndex = 4
        //    [1, 4, 6, 4, 1]
        // rowIndex = 5
        //   [1, 5, 10, 10, 5, 1]
        // rowIndex = 6
        // [1, 6, 15, 20, 15, 6, 1]

        List<List<Integer>> output = new ArrayList<>();

        List<Integer> inside = new ArrayList<>();
        inside.add(1); 
        output.add(inside);
        if (rowIndex == 0) return output.get(rowIndex);

        inside = new ArrayList<>();
        inside.add(1);
        inside.add(1);
        output.add(inside);
        if (rowIndex == 1) return output.get(rowIndex);

        for (int i = 2; i <= rowIndex; i++) {
            inside = new ArrayList<>();
            inside.add(1);
            List<Integer> prevInside = output.get(i - 1);

            for (int j = 1; j < i; j++) {
                int val = prevInside.get(j-1) + prevInside.get(j);
                inside.add(val);
            }

            inside.add(1);
            output.add(inside);
        }

        return output.get(rowIndex);
    }
}
