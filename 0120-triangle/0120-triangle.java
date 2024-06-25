class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        for (int i = triangle.size() - 1; i > 0; i--) {
            List<Integer> upRow = triangle.get(i-1);
            List<Integer> downRow = triangle.get(i);

            for (int j = 0; j < upRow.size(); j++) {
                int upNumber = upRow.get(j);
                int downRowLeft = downRow.get(j);
                int downRowRight = downRow.get(j+1);
                upNumber = Math.min(upNumber + downRowLeft, upNumber + downRowRight);
                upRow.set(j, upNumber);
            }
        }
        return triangle.get(0).get(0);
    }
}