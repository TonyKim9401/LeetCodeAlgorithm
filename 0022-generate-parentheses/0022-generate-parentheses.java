class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        backtracking(n, 0, 0, "", output);
        return output;
    }

    public void backtracking(int n, int open, int close, String str, List<String> output) {
        if (open == close && open == n) {
            output.add(str);
            return;
        }

        if (open < n) {
            backtracking(n, open+1, close, str+"(", output);
        }

        if (close < open) {
            backtracking(n, open, close+1, str+")", output);
        }
    }
}