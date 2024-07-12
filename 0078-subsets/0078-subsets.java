class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(0, nums, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int idx, int[] nums, List<Integer> inside, List<List<Integer>> output) {
        if (idx == nums.length) {
            output.add(new ArrayList<>(inside));
            return;
        }

        inside.add(nums[idx]);
        backtracking(idx+1, nums, inside, output);
        inside.remove(inside.size()-1);
        backtracking(idx+1, nums, inside, output);
    }
}