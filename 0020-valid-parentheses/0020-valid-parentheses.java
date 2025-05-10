class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.add(')');
            else if (c == '[') stack.add(']');
            else if (c == '{') stack.add('}');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        
        return stack.isEmpty();
    }
}