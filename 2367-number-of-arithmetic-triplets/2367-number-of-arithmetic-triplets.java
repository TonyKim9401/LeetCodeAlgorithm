class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int output = 0;
        Map<Integer,Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int firstNum = nums[i];
            int secondNum = firstNum + diff;
            memo.put(secondNum, i);
        }
        for (int k = 0; k < nums.length; k++) {
            int thirdNum = nums[k];
            int secondNum = thirdNum - diff;
            if (memo.containsKey(secondNum) && memo.get(secondNum) < k) {
                int idxI = memo.get(secondNum);
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == secondNum &&
                        idxI < i && i < k) {
                            output += 1;
                        }
                }
            }
        }
        return output;
    }
}