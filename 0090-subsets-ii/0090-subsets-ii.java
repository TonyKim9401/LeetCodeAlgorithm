class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        backtracking(nums, 0, new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int[] nums, int idx, List<Integer> inside, List<List<Integer>> output) {
        output.add(new ArrayList<>(inside));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i-1] == nums[i]) continue;
            inside.add(nums[i]);
            backtracking(nums, i+1, inside, output);
            inside.remove(inside.size()-1);
        }
    }
}