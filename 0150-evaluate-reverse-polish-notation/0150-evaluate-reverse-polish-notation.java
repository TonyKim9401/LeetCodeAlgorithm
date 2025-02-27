class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            switch (str) {
                case "+" -> {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a+b);
                }
                case "-" -> {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a-b);
                }
                case "*" -> {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a*b);
                }
                case "/" -> {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a/b);
                }
                default -> {
                    stack.push(Integer.valueOf(str));
                }
            }
        }
        return stack.pop();
    }
}