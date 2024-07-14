class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(candidates, target, 0, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int[] candidates, int target, int idx, List<Integer> inside, List<List<Integer>> output) {
        if (target == 0) {
            output.add(new ArrayList<>(inside));
            return;
        }

        if (idx > candidates.length-1 || target < 0) return;

        inside.add(candidates[idx]);
        backtracking(candidates, target-candidates[idx], idx, inside, output);
        inside.remove(inside.size()-1);
        backtracking(candidates, target, idx+1, inside, output);
    }
}