class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charList = str.toCharArray();
            Arrays.sort(charList);
            String sortedStr = new String(charList);

            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                List<String> inside = new ArrayList<>();
                inside.add(str);
                map.put(sortedStr, inside);
            }
        }

        for (String key : map.keySet()) {
            output.add(map.get(key));
        }
        return output;
    }
}