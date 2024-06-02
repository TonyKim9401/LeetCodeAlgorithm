class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int result = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int[] currentPoint = points[i];
            int[] nextPoint = points[i + 1];

            int xDiff = currentPoint[0] - nextPoint[0];
            int yDiff = currentPoint[1] - nextPoint[1];
            
            result += Math.max(Math.abs(xDiff), Math.abs(yDiff));
        } 
        return result;
    }
}