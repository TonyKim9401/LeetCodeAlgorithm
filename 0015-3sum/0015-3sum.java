class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];

                if (temp == 0) {
                    output.add(List.of(nums[i], nums[j], nums[k]));
                    
                    while (j < k && nums[j] == nums[j + 1]) j += 1;
                    while (j < k && nums[k] == nums[k - 1]) k -= 1;

                    j += 1;
                    k -= 1;
                } else if (temp > 0) {
                    k -= 1;
                } else {
                    j += 1;
                }
            }
        }
        return output;
    }
}