class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> empls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            empls.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                empls.get(manager[i]).add(i);
            }
        }

        return dfs(headID, empls, informTime);
    }

    private int dfs(int headID, List<List<Integer>> empls, int[] informTime) {
        int maxTime = 0;

        for (int empl : empls.get(headID)) {
            int time = dfs(empl, empls, informTime);
            maxTime = Math.max(maxTime, time);
        }

        return informTime[headID] + maxTime;
    }
}