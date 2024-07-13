class Solution {
    public int maximumGap(int[] nums) {
        int diff = 0;
        Arrays.sort(nums);
        
        if(nums.length < 2)
            return 0;
        
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]-nums[i-1] > diff){
                diff = nums[i]-nums[i-1];
            }
        }
        return diff;
    }
}