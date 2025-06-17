class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        List<List<Integer>> empl = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            empl.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                empl.get(manager[i]).add(i);
            }
        }

        return dfs(headID, empl, informTime);
    }

    private int dfs(int headID, List<List<Integer>> empl, int[] informTime) {
        int maxTime = 0;

        for (int sub : empl.get(headID)) {
            int time = dfs(sub, empl, informTime);
            maxTime = Math.max(maxTime, time);
        }

        return informTime[headID] + maxTime;
    }
}