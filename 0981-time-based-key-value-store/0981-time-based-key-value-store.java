class TimeMap {
    private Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            TreeMap<Integer, String> subMap = map.get(key);
            subMap.put(timestamp, value);
        } else {
            TreeMap<Integer, String> subMap = new TreeMap<>();
            subMap.put(timestamp, value);
            map.put(key, subMap);
        }
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        Map<Integer, String> subMap = map.get(key);
        
        Map.Entry<Integer, String> entry = map.get(key).floorEntry(timestamp);
        if (entry == null) return "";
        return entry.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */