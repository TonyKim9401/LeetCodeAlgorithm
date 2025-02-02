class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        
        sum /= 2;

        int[][] dp = new int[nums.length][sum + 1];
        for (int[] inside : dp) {
            Arrays.fill(inside, -1);
        }

        return find(nums, nums.length - 1, sum, dp);
    }

    private boolean find(int[] nums, int idx, int target, int[][] dp) {
        if (target == 0) return true;
        if (idx == 0) return nums[idx] == target; 

        // -1 = not calculated
        // 1 = true
        // 0 = false
        
        if (dp[idx][target] != -1) return dp[idx][target] == 1;

        boolean notSub = find(nums, idx - 1, target, dp);
        boolean sub = false;

        if (target >= nums[idx]) {
            sub = find(nums, idx - 1, target - nums[idx], dp);
        }

        dp[idx][target] = (notSub || sub) ? 1 : 0;

        return dp[idx][target] == 1;
    }
}
/*
if S is odd return false


def find(int ind,int target){

if target == 0 return true
if ind == 0 and a[0] = target return True
if(dp[ind-1][target] != -1 return dp[ind-1][target];

bootlean nottake = find(ind-1,target)
Boolean take = false
if(target>=a[ind])
   take = find(ind-1,target - a[ind])

return dp[ind][target] = take || nottake



10^3 and 10^3
 dp[ind][target]
dp[1001][1000]
*/