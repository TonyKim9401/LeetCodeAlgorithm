class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 2) return true;

        Arrays.sort(arr);

        int gap = arr[1] - arr[0];

        int prevNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int curGap = arr[i] - prevNum;
            if (gap != curGap) return false;
            prevNum = arr[i];
        }
        
        return true;
    }
}