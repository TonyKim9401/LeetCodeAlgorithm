class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // dp
        
        // stack
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                output[idx] = i - idx;
            }
            stack.push(i);
        }
        return output;
    }
}