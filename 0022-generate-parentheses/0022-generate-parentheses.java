class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        backtracking(0, 0, "", n, output);
        return output;
    }

    public void backtracking(int open, int close, String s, int n, List<String> output) {
        if (open == close && open + close == n * 2) {
            output.add(s);
            return;
        }

        if (open < n) {
            backtracking(open+1, close, s+"(", n, output);
        }
        if (close < open) {
            backtracking(open, close+1, s+")", n, output);
        }
    }
}