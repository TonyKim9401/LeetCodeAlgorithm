class Solution {
    private List<String> output = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();
    private int[] counts;
    public List<String> generateParenthesis(int n) {
        counts = new int[2];
        counts[0] = n;
        counts[1] = n;
        backtracking();
        return output;
    }

    private void backtracking() {
        if (counts[0] == 0 && counts[1] == 0) {
            output.add(sb.toString());
            return;
        }

        int opening = counts[0];
        int closing = counts[1];

        if (opening > 0) {
            sb.append("(");
            counts[0] -= 1;
            backtracking();
            sb.deleteCharAt(sb.length()-1);
            counts[0] += 1;
        }
        if (closing > opening) {
            sb.append(")");
            counts[1] -= 1;
            backtracking();
            sb.deleteCharAt(sb.length()-1);
            counts[1] += 1;
        }
    }
}