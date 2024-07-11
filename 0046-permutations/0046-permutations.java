class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), output);
        return output;
    }

    public void backtrack(int[] nums, List<Integer> inside, List<List<Integer>> output) {
        if (inside.size() == nums.length) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (inside.contains(nums[i])) continue;
            inside.add(nums[i]);
            backtrack(nums,inside,output);
            inside.remove(inside.size() - 1);
        }
    }
}