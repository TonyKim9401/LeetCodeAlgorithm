class Solution {
    public int lengthOfLIS(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (list.size() != 0 && list.get(list.size()-1) == num) continue;
    
            int start = 0;
            int end = list.size();
            
            while (start < end) {
                int mid = start + (end - start) / 2;
                
                if (list.get(mid) < num) start = mid + 1;
                else end = mid;
            }
            if (start == list.size()) list.add(num);
            else list.set(start, num);
        }
        return list.size();
    }
}