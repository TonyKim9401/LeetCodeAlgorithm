class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int k = nums.length - 1;

            int j = i + 1;
            while (j < k) {
        
                int sum = nums[i]+nums[j]+nums[k];
                
                if (sum > 0) k -= 1;
                else if (sum < 0) j += 1;
                else {
                    output.add(List.of(nums[i], nums[j], nums[k]));
                    j += 1;
                    while (j < k && nums[j] == nums[j-1]) {
                        j += 1;
                    }
                }
            }
        }
        return output;
    }
}