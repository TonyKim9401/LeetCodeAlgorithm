class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        // 출발지에 없는 도착지를 찾기
        String output = paths.get(0).get(1);
        while (map.containsKey(output)) {
            output = map.get(output);
        }

        return output;
    }
}
