class Solution {
    public int romanToInt(String s) {
        String[] exceptions = {"IV", "IX", "XL", "XC", "CD", "CM"};
        Map<String, Integer> map = new HashMap<>();
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int result = 0;
        
        for (int i = 0; i < exceptions.length; i++) {
            if (s.contains(exceptions[i])) {
                s = s.replaceFirst(exceptions[i], "");
                result += map.get(exceptions[i]);
                i--;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result += 1;
            } else if (s.charAt(i) == 'V') {
                result += 5;
            } else if (s.charAt(i) == 'X') {
                result += 10;
            } else if (s.charAt(i) == 'L') {
                result += 50;
            } else if (s.charAt(i) == 'C') {
                result += 100;
            } else if (s.charAt(i) == 'D') {
                result += 500;
            } else if (s.charAt(i) == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}