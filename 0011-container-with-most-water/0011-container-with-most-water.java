class Solution {
    public int maxArea(int[] height) {
        // [1, 1]
        // [2, 8]
        // 1 by 1 = 1
        
        // [2, 8]
        // [9, 7]
        // 7, 7 => 49
        
        int max = 0;

        int start = 0;
        int end = height.length - 1;

        while (start <= end) {
            int heightLeft = height[start];
            int heightRight = height[end];

            int hei = Math.min(heightLeft, heightRight);
            int wid = end - start;

            if (hei*wid > max) {
                max = Math.max(max, hei*wid);
                start += 1;
            } else {
                end -= 1;
            }
        }
        return max;
    }
}