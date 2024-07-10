class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        combination(candidates, target, 0, new ArrayList<>(), 0, output);
        return output;
    }

    public void combination(int[] candidates, int target, int idx, List<Integer> comb, int total, List<List<Integer>> output) {
        if (target == total) {
            output.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || idx > candidates.length-1) return;

        comb.add(candidates[idx]);
        combination(candidates, target, idx, comb, total + candidates[idx], output);
        comb.remove(comb.size()-1);
        combination(candidates, target, idx+1, comb, total, output);
    }
}