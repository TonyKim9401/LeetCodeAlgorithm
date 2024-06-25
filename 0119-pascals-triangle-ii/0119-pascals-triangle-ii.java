class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> output = new ArrayList<>();
        output.add(1);
        long prev = 1;
        for (int i = 1; i <= rowIndex; i++) {
            long nextValue = prev * (rowIndex - i + 1) / i;
            output.add((int)nextValue);
            prev = nextValue;
        }
        return output;
    }
}