public class Codec {
    Map<String, String> m = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Random rand = new Random();
        long num = rand.nextLong();
        String short_url = "http://tinyurl.com/" + Long.toString(num);
        while(m.values().contains(short_url)){
            num = rand.nextLong();
            short_url = "http://tinyurl.com/" + Long.toString(num);

        }
        m.put(short_url, longUrl);
        return short_url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return m.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));