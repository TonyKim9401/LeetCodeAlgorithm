class Solution {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
        int currentMin = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // 해당 값이 0 미만이면 음수로 부호가 바뀜
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);

            // 현재 최대값과 비교하여 값을 갱신
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}