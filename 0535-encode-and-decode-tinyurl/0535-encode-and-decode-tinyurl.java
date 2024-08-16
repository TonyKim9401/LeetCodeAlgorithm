public class Codec {

    private Map<Integer, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        // tony -> encoded -> encod(tony)
        // https:   //   sample.com
        String[] value = longUrl.split("//");
        map.put(1, value[0]);
        map.put(2, value[1]);
        return "";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // encod(tony) -> decode -> tony
        return map.get(1) + "//" + map.get(2);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));