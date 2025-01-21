class Solution {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> candidates = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int firstNum = nums[i];

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int secondNum = nums[j];
                int thirdNum = nums[k];

                int sum = firstNum + secondNum + thirdNum;
                if (sum == target) return sum;
                else if (sum < target) {
                    candidates.add(sum);
                    j += 1;
                } else {
                    candidates.add(sum);
                    k -= 1;
                }
            }
        }
        
        Collections.sort(candidates);
        int closest = candidates.get(0);
        for (int i = 1; i < candidates.size(); i++) {
            int prevNum = candidates.get(i - 1);
            int candidate = candidates.get(i);
            if (candidate > target) {
                int prevGap = Math.abs(target - prevNum);
                int candidateGap = Math.abs(target - candidate);
                return prevGap > candidateGap ? candidate : prevNum;
            }
            closest = candidates.get(i);
        }
        return closest;
    }
}