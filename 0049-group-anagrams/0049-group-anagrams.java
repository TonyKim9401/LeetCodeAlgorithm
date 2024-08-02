class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();

        // O(N^3)
        // standatd = "eat" [for]
        // target = "teae".contains('e') [for]
        // "ta".replaceFirst("e", "") [for]
        
        // map
        // map.put(2, "tan"); [for]
        // map.put(4, "nat");
        // [0, 1, "ant", 3, "ant", 5]; [for], O(nlogn)
        // start at index 2 current element is "ant" [double for]
        // iterating the other sorted element from the other element
        // "ant".equals("ant")
        // "nat" = map.get(4)
        // O(n^2)

        // sorted string key from the hashmap
        // ["eat","tea","tan","ate","nat","bat"]
        // ["aet","aet","ant","aet","ant","abt"] [for], O(nlogn)
        // 
        // if (map.containsKey("aet")) {
        //    map.get("aet").add(eat)
        // } else {
        //    map.put("ant", new ArrayList<>("tan"));
        // }

        Map<String, List<String>> map = new HashMap<>();

        String[] sortStrs = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            sortStrs[i] = new String(str);
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

        //
        // O(NxM)

        return output;
    }
}