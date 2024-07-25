class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        // map has 52 keys
        for (int i = 1; i <= 26; i++) {
        		char smallValue = (char)('a' + i - 1);
        		map.put(smallValue, 0);
        }
        for (int i = 1; i <= 26; i++) {
        		char capitalValue = (char)('A' + i - 1);
        		map.put(capitalValue, 0);
        }
        for (int i = 0; i < 10; i++) {
            char intValue = (char)('1' + i - 1);
            map.put(intValue, 0);
        }
        
        // HashMap<>
        // t 1
        // r 1
        // e 2
        for (char c : s.toCharArray()) {
            int count = map.get(c);
            map.put(c, count+1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) > 0) {
                System.out.println(c + " " + map.get(c));
            }
        }
        // -> sort value descending
        // e 2
        // t 1
        // r 1
        List<Character> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        StringBuilder sb = new StringBuilder();
        for (char c : keyList) {
            int iteration = map.get(c);
            for (int i = 0; i < iteration; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}