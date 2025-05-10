class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int output = Integer.MIN_VALUE;
        
        while (left < right) {
            int width = right - left;
            int lowHigh = 0;

            if (height[left] > height[right]) {
                lowHigh = height[right];
                right -= 1;
            } else {
                lowHigh = height[left];
                left += 1;
            }

            output = Math.max(output, width*lowHigh);
        }

        return output;
    }
}