class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 1 ; j < nums.length; j++) {
                if (i == j) break;
                int nextNum = nums[j];
                if (num + nextNum == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}