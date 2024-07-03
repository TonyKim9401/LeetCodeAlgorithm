class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        int output = 0;
        for (String str : tokens) {
            if ("+-*/".contains(str)) {
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                switch (str) {
                    case "+" -> output = a+b;
                    case "-" -> output = a-b;
                    case "*" -> output = a*b;
                    case "/" -> output = a/b;
                }
                stack.push(output+"");
            } else {
                stack.push(str);
            }
        }
        return Integer.valueOf(stack.pop());
    }
}