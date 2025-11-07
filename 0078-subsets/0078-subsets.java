class Solution {
    private List<List<Integer>> output = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        // base conditions
        backtracking(nums, 0, new ArrayList<>());
        return output;
    }

    private void backtracking(int[] nums, int idx, List<Integer> subset) {

        output.add(new ArrayList<>(subset));

        for (int i = idx; i < nums.length; i++) {
            subset.add(nums[i]);
            backtracking(nums, i+1, subset);
            subset.remove(subset.size() - 1);
        }
    }
}