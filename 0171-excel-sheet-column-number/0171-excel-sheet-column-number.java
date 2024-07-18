class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            int value = (int)'A' + i - 1;
            map.put((char)value, i);
        }

        int output = 0;

        int length = columnTitle.length()-1;
        for (char c : columnTitle.toCharArray()) {
            int value = map.get(c);
            output += value * (Math.pow(26, length));
            length -= 1;
        }
        return output;
    }
}