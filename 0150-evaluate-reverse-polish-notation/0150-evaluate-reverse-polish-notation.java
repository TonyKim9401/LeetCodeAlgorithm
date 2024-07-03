class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            if ("+-*/".contains(str)) {
                int b = stack.pop();
                int a = stack.pop();
                switch (str) {
                    case "+" -> stack.push(a+b);
                    case "-" -> stack.push(a-b);
                    case "*" -> stack.push(a*b);
                    case "/" -> stack.push(a/b);
                }
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }
}