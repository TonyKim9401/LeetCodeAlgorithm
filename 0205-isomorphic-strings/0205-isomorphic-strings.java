class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sArr = new int[128];
        int[] tArr = new int[128];
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!map.containsKey(sChar)) map.put(sChar, tChar);

            sArr[sChar] += 1;
            tArr[tChar] += 1;

            if (map.get(sChar) != tChar || 
                sArr[sChar] != tArr[tChar]) 
                return false;
        }

        return true;
    }
}