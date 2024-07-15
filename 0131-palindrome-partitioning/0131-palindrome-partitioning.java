class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> output = new ArrayList<>();
        backtracking(s, 0, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(String s, int start, List<String> inside, List<List<String>> output) {
        if (start == s.length()) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            if (isPalindrome(s, start, i - 1)) {
                inside.add(s.substring(start, i));
                backtracking(s, i, inside, output);
                inside.remove(inside.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}