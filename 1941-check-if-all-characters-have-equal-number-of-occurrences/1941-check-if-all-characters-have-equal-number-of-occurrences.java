class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[27];

        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }

        for (int num : arr) {
            if (num != 0 && prev == 0) prev = num;
            if (num != 0 && prev != num) return false;
        }
        return true;
    }
}