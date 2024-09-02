class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        String[] sortStrs = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            sortStrs[i] = new String(charArray);

            if (map.containsKey(sortStrs[i])) {
                map.get(sortStrs[i]).add(strs[i]);
            } else {
                List<String> inside = new ArrayList<>();
                inside.add(strs[i]);
                map.put(sortStrs[i], inside);
            }
        }

        for (String key : map.keySet()) {
            output.add(map.get(key));
        }
        return output;
    }
}