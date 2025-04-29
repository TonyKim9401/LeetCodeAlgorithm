class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        String[] sortStrs = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            sortStrs[i] = key;
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
        }

        for (int i = 0; i < strs.length; i++) {
            List<String> list = map.get(sortStrs[i]);
            list.add(strs[i]);
            map.put(sortStrs[i], list);
        }

        for (String key : map.keySet()) {
            output.add(map.get(key));
        }

        return output;
    }
}