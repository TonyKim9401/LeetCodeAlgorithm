class MinStack {

    // first 2 arrays
    // first for using as a stack
    // second for checkig its min value
    
    List<Integer> nums;
    List<Integer> minNums;
    public MinStack() {
        nums = new ArrayList<>();
        minNums = new ArrayList<>();
    }
    
    public void push(int val) {
        nums.add(val);
        if (minNums.size() != 0) {
            int minNumber = minNums.get(minNums.size()-1);
            minNumber = Math.min(minNumber, val);
            minNums.add(minNumber);
        } else {
            minNums.add(val);
        }
    }
    
    public void pop() {
        if (nums.size() != 0) {
            nums.remove(nums.size()-1);
            minNums.remove(minNums.size()-1);
        }
    }
    
    public int top() {
        int output = -1;
        if (nums.size() != 0) {
            output = nums.get(nums.size()-1);
        }
        return output;
    }
    
    public int getMin() {
        int output = -1;
        if (minNums.size() != 0) {
            output = minNums.get(minNums.size()-1);
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