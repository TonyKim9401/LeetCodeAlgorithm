class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        
        // O(N^3)
        // standard = "eat" [for]
        // target = "teae".contains('e') [for]
        // "ta".replaceFirst("e", "") [for]
        /* does not work
        List<Integer> visit = new ArrayList<>();
        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            if (visit.contains(i)) continue;
            List<String> inside = new ArrayList<>();
            inside.add(str);
            visit.add(i);

            if (!str.equals("")) {
                for (int k = i+1; k < strs.length; k++) {
                    String nextStr = strs[k];
                    String candidate = strs[k];
                    if (candidate.equals("")) continue;
            
                    for (char c : str.toCharArray()) {
                        if (!nextStr.contains(String.valueOf(c))) break;
                        nextStr = nextStr.replaceFirst(String.valueOf(c), "");
                    }
                    if (nextStr.equals("") && !visit.contains(k)) {
                        inside.add(candidate);
                        visit.add(k);
                    }
                }
            } else {
                for (int k = i+1; k < strs.length; k++) {
                    if (strs[k].equals("")) {
                        inside.add(strs[k]);
                        visit.add(k);
                    }
                }
            }
            output.add(inside);
        }
        */
        
        // map
        // map.put(2, "tan"); [for]
        // map.put(4, "nat");
        // [0, 1, "ant", 3, "ant", 5]; [for], O(nlogn)
        // start at index 2 current element is "ant" [double for]
        // iterating the other sorted element from the other element
        // "ant".equals("ant")
        // "nat" = map.get(4)
        // O(n^2) does not work
        /*
        Map<Integer, String> map = new HashMap<>();
        String[] sortedStrs = new String[strs.length];

        int idx = 0;
        for (String str : strs) {
            char[] cArray = str.toCharArray();
            Arrays.sort(cArray);
            sortedStrs[idx] = new String(cArray);
            idx += 1;
        }

        Set<String> visit = new HashSet<>();
        for (int i = 0; i < sortedStrs.length; i++) {
            map.put(i, sortedStrs[i]);
        }

        for (int i = 0; i < sortedStrs.length; i++) {
            String str = sortedStrs[i];
        }*/
        

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