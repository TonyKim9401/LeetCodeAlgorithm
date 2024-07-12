class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(candidates, target, 0, 0, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int[] candidates, int target, int total, int idx, List<Integer> inside, List<List<Integer>> output) {
        if (target == total) {
            output.add(new ArrayList<>(inside));
            return;
        }

        if (total > target || idx > candidates.length-1) return;
        inside.add(candidates[idx]);
        backtracking(candidates, target, total+candidates[idx], idx, inside, output);
        inside.remove(inside.size()-1);
        backtracking(candidates, target, total, idx+1, inside, output);
    }
}