class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> inter = new ArrayList<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !inter.contains(nums1[i])) {
                    inter.add(nums1[i]);
                    break;
                }
            }
        }

        int[] output = new int[inter.size()];
        for (int i = 0; i < inter.size(); i++) {
            output[i] = inter.get(i);
        }
        return output;
    }
}