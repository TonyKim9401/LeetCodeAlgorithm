class NumArray {

    private int[] target;

    public NumArray(int[] nums) {
        this.target = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        while (left <= right) {
            sum += target[left];
            left += 1;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */