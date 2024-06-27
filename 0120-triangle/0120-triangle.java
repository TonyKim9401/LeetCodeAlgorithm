class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int output = 0;
        for (int i = triangle.size() - 1; i > 0; i--) {
            List<Integer> upRow = triangle.get(i-1);
            List<Integer> downRow = triangle.get(i);
            List<Integer> newUpRow = new ArrayList<>();
            for (int j = 0; j < upRow.size(); j++) {
                int up = upRow.get(j);
                int a = downRow.get(j);
                int b = downRow.get(j+1);
                up = Math.min(up + a, up + b);
                newUpRow.add(up);
            }
            triangle.set(i-1, newUpRow);
        }
        return triangle.get(0).get(0);
    }
}