class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        // queries = { 3 }, nums { 3 }
        // if (queries.length == 1 && nums.length == 1 && queries[0] == nums[0]) {
        //     return new int[]{ 1 };
        // }

        // 1 <= n <= 1000
        // 1 <= m <= 1000
        // 1 <= nums.length <= 10^6
        // 1 <= queries.length <= 10^6 (10 power 6)

        // declare int variables n, m based the given arrays named nums and queries

        int n = nums.length;
        int m = queries.length;

        // sort nums array with ascending
        Arrays.sort(nums);
        // [1,2,4,5];
        // [1,1+2,1+2+4,1+2+4+5];
        //   1,2,3,4 .... 
        //-> [1,3,6,12];
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i-1];
        }

        int[] output = new int[m];

        // use 2 for-loop to figure out the output.
        for (int i = 0; i < m; i++) {
            int q = queries[i];

            int start = 0;
            int end = n - 1;

            // declare int variables to adopt binary search
            while (start <= end) {
                int mid = start + (end - start) / 2;
                
                if (nums[mid] == q) {
                    output[i] = mid + 1;
                    break;
                } else if (nums[mid] < q) {
                    output[i] = mid + 1;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return output;        
    }
}