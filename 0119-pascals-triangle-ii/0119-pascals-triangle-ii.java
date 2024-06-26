class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> output = new ArrayList<>();

        output.add(1);
        long prev = 1;
        for (int i = 1; i <= rowIndex; i++) {
            long nextVal = prev * (rowIndex - i + 1) / i;
            output.add((int)nextVal);
            prev = nextVal;
        }
        return output;
    }
}