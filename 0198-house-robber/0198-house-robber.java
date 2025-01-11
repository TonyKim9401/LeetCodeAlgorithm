class Solution {
    public int rob(int[] nums) {
        int maxMoney = 0;
        int tempMoney = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentMoney = Math.max(maxMoney, tempMoney + nums[i]);
            tempMoney = maxMoney;
            maxMoney = currentMoney;
        }

        return maxMoney;
    }
}