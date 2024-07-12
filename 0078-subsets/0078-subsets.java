class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(nums, 0, new ArrayList<>(), output);
        return output;
    }
    
    public void backtracking(int[] nums, int idx, List<Integer> inside, List<List<Integer>> output) {
        if (idx == nums.length) {
            output.add(new ArrayList<>(inside));
            return;
        }

        inside.add(nums[idx]);
        backtracking(nums, idx+1, inside, output);
        inside.remove(inside.size()-1);
        backtracking(nums, idx+1, inside, output);
    }
}