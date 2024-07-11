class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> output = new ArrayList<>();
        backtracking(candidates, target, 0, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int[] candidates, int target, int idx, List<Integer> inside, List<List<Integer>> output) {
        if (target < 0) return;
        if (target == 0) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i-1]) continue;
            if (candidates[i] > target) break;
            inside.add(candidates[i]);
            backtracking(candidates, target-candidates[i], i+1, inside, output);
            inside.remove(inside.size()-1);
        }
    }
}