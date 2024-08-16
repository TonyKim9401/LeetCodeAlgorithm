public class Codec {

    private String nextKey = "tinyUrl.com";
    private String prevKey = "http";

    private Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        // tony -> encoded -> encod(tony)
        // https://
        String[] value = longUrl.split("//");
        map.put(prevKey, value[0]);
        map.put(nextKey, value[1]);
        return "https://tinyUrl.com";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // encod(tony) -> decode -> tony
        return map.get(prevKey) + "//" + map.get(nextKey);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));