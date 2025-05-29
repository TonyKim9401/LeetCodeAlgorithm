class Solution {
    public List<Integer> getRow(int rowIndex) {
        // rowIndex = 4
        //    [1, 4, 6, 4, 1]
        // rowIndex = 5
        //   [1, 5, 10, 10, 5, 1]
        // rowIndex = 6
        // [1, 6, 15, 20, 15, 6, 1]

        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        if (rowIndex == 0) return prev;
        prev.add(1);
        if (rowIndex == 1) return prev;

        List<Integer> next;
        for (int i = 2; i <= rowIndex; i++) {
            next = new ArrayList<>();
            next.add(1);
            for (int j = 1; j < i; j++) {
                next.add(prev.get(j-1) + prev.get(j));
            }
            next.add(1);
            prev = next;
        }

        return prev;
    }
}
