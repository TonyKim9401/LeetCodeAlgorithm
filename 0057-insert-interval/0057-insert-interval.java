class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        int n = intervals.length;
        List<int[]> output = new ArrayList<>();

        // 그냥 넣기
        while (i < n && intervals[i][1] < newInterval[0]) {
            output.add(intervals[i]);
            i += 1;
        }

        // newInterval을 새로 만들면 사용된 interval들이 하나가 됩니다 :)
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i += 1;
        }
        output.add(newInterval);

        // 그냥 넣기
        while (i < n) {
            output.add(intervals[i]);
            i += 1;
        }
        return output.toArray(new int[output.size()][]);
    }
}