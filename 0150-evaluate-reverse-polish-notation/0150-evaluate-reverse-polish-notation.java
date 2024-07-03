class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        int output = 0;
        for (String str : tokens) {
            if ("+-*/".contains(str)) {
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                if (str.equals("+")) output = a + b;
                else if (str.equals("-")) output = a - b;
                else if (str.equals("*")) output = a * b;
                else if (str.equals("/")) output = a / b;
                stack.push(output+"");
            } else {
                stack.push(str);
            }
        }
        return Integer.valueOf(stack.pop());
    }
}