class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char close = stack.pop();
                if (c == ')' && close != '(') return false;
                if (c == ']' && close != '[') return false;
                if (c == '}' && close != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}