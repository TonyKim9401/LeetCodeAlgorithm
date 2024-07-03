class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            if ("+-*/".contains(str)) {
                int b = stack.pop();
                int a = stack.pop();
                int output = 0;
                switch (str) {
                    case "+" -> output = a+b;
                    case "-" -> output = a-b;
                    case "*" -> output = a*b;
                    case "/" -> output = a/b;
                }
                stack.push(output);
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }
}