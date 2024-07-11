class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        backtracking(nums, new ArrayList<>(), new ArrayList<>(), output);
        return output;
    }

    public void backtracking(int[] nums, List<Integer> inside, List<Integer> check, List<List<Integer>> output) {
        if (nums.length == inside.size()) {
            output.add(new ArrayList<>(inside));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!check.contains(i)) {
                inside.add(nums[i]);
                check.add(i);
                backtracking(nums, inside, check, output);
                inside.remove(inside.size()-1);
                check.remove(check.size()-1);
                while (i < nums.length - 1 && nums[i] == nums[i+1]) i += 1;
            }
        }
    }
}