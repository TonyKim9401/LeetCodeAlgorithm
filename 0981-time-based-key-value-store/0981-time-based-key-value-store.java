class Pair {
    int timestamp;
    String val;

    Pair(int timestamp, String val) {
        this.timestamp = timestamp;
        this.val = val;
    }
}

class TimeMap {

    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            map.get(key).add(new Pair(timestamp, value));
        } else {
            List<Pair> pairList = new ArrayList<>();
            pairList.add(new Pair(timestamp, value));
            map.put(key, pairList);
        }
    }
    
    public String get(String key, int timestamp) {
        String output = "";
        if (map.containsKey(key)) {
            int start = 0;
            int end = map.get(key).size() - 1;

            List<Pair> list = map.get(key);
            while (start <= end) {
                int mid = (start + end) / 2;

                if (list.get(mid).timestamp == timestamp) {
                    return list.get(mid).val;
                } else if (list.get(mid).timestamp < timestamp) {
                    output = list.get(start).val;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return output;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */