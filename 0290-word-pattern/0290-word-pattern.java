class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[i])) return false;
            } else {
                if (!map.keySet().contains(c) && set.contains(arr[i])) return false;
                map.put(c, arr[i]);
                set.add(arr[i]);
            }
        }
        
        return true;
    }
}