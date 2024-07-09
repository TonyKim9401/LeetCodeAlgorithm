class Solution {
    public List<String> summaryRanges(int[] nums) {
        // start, end
        // for-loop nums
        List<String> output = new ArrayList<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = i;
            if (i == nums.length - 1 || nums[i] + 1 != nums[i+1]) {
                if (left == right) {
                    output.add(String.valueOf(nums[left]));
                } else {
                    output.add(nums[left] + "->" + nums[right]);
                }
                left = i + 1;
            }
        }
        return output;
    }
}