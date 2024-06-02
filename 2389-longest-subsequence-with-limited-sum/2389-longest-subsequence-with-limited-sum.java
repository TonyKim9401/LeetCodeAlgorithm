class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        int n = nums.length;
        int m = queries.length;
        int[] result = new int[m];
        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        for (int i = 0; i < m; i++) {
            int q = queries[i];

            int start = 0;
            int end = n - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == q) {
                    result[i] = mid + 1;
                    break;
                } else if (nums[mid] < q) {
                    result[i] = mid + 1;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return result;
    }
}