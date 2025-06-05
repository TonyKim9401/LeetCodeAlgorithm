class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int output = 0;

        for (int num : nums) {
            sum += num;
            output = Math.min(output, sum);
        }

        return 1 - output;
    }
}
