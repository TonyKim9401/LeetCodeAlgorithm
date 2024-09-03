class MinStack {

    private List<Integer> stack;
    private List<Integer> sortedStack;

    public MinStack() {
        stack = new ArrayList<>();
        sortedStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if (sortedStack.isEmpty() || val <= sortedStack.get(sortedStack.size()-1)) 
            sortedStack.add(val);
    }
    
    public void pop() {
        int popValue = stack.remove(stack.size()-1);
        if (popValue == sortedStack.get(sortedStack.size()-1)) sortedStack.remove(sortedStack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return sortedStack.get(sortedStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */