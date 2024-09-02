class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) return List.of(List.of(strs[0]));

        List<List<String>> output = new ArrayList<>();
        
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            map.put(i, strs[i]);
        }

        String[] sortedStrs = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            sortedStrs[i] = new String(charArray);
        }

        // map에는 실제 값
        // sortedStrs 정렬해서 같은것들 하나로 뭉쳐서 output에 넣기
        boolean[] visit = new boolean[strs.length];
        
        for (int i = 0; i < sortedStrs.length; i++) {
            if (visit[i]) continue;

            String str = sortedStrs[i];
            List<String> inside = new ArrayList<>();

            visit[i] = true;
            inside.add(map.get(i));

            for (int j = i + 1; j < sortedStrs.length; j++) {
                if (visit[j]) continue;

                if (str.equals(sortedStrs[j])) {
                    inside.add(map.get(j));
                    visit[j] = true;
                }
            }
            output.add(inside);
        }

        return output;
    }
}