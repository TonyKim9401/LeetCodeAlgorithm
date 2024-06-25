class MinStack {

    // first 2 arrays
    // first for using as a stack
    // second for checkig its min value
    
    List<Integer> firstArray;
    List<Integer> secondArray;
    public MinStack() {
        firstArray = new ArrayList<>();
        secondArray = new ArrayList<>();
    }
    
    public void push(int val) {
        firstArray.add(val);
        if (secondArray.size() != 0) {
            int minNumber = secondArray.get(secondArray.size()-1);
            minNumber = Math.min(minNumber, val);
            secondArray.add(minNumber);
        } else {
            secondArray.add(val);
        }
    }
    
    public void pop() {
        if (firstArray.size() != 0) {
            firstArray.remove(firstArray.size()-1);
            secondArray.remove(secondArray.size()-1);
        }
    }
    
    public int top() {
        int output = -1;
        if (firstArray.size() != 0) {
            output = firstArray.get(firstArray.size()-1);
        }
        return output;
    }
    
    public int getMin() {
        int output = -1;
        if (secondArray.size() != 0) {
            output = secondArray.get(secondArray.size()-1);
        }
        return output;
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