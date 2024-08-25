class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // TC: O(n^2)
        // SC: O(1)
        for (int i = 0; i < numbers.length; i++) {
            int firstVal = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                int secondVal = numbers[j];
                if (firstVal + secondVal - target == 0) {
                    int[] output = new int[2];
                    output[0] = i + 1;
                    output[1] = j + 1;
                    return output;
                }
            }
        }
        return new int[]{-1,-1};
    }
}