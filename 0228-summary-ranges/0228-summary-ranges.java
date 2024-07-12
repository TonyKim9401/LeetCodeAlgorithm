class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        List<String> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int end = i;
            if (i == nums.length-1 || nums[i] + 1 < nums[i+1]) {
                if (start == end) {
                    output.add(String.valueOf(nums[end]));
                } else {
                    output.add(nums[start] + "->" + nums[end]);
                }
                start = i + 1;
            }
        }
        return output;
    }
}