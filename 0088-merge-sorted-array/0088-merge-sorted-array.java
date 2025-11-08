class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m -= 1;
        n -= 1;

        int idx = m + n + 1;
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[idx] = nums1[m];
                m -= 1;
            } else {
                nums1[idx] = nums2[n];
                n -= 1;
            }

            idx -= 1;
        }
    }
}