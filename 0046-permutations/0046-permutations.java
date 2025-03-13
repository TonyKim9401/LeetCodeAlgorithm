class Solution {
    private List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums, new ArrayList<>());
        return output;
    }

    private void backtracking(int[] nums, List<Integer> inside) {
        if (inside.size() == nums.length) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (inside.contains(nums[i])) continue;
            inside.add(nums[i]);
            backtracking(nums, inside);
            inside.remove(inside.size() - 1);
        }
    }
}