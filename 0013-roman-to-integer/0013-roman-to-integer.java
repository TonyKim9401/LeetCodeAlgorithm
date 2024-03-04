import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> exceptions = new HashMap<>();
        exceptions.put("IV", 4);
        exceptions.put("IX", 9);
        exceptions.put("XL", 40);
        exceptions.put("XC", 90);
        exceptions.put("CD", 400);
        exceptions.put("CM", 900);

        int result = 0;
        boolean check = true;
        while (check) {
            for (String key : exceptions.keySet()) {
                check = false;
                if (s.contains(key)) {
                    result += exceptions.get(key);
                    s = s.replace(key, "");
                    check = true;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            switch(a) {
                case 'I' -> result += 1;
                case 'V' -> result += 5;
                case 'X' -> result += 10;
                case 'L' -> result += 50;
                case 'C' -> result += 100;
                case 'D' -> result += 500;
                case 'M' -> result += 1000;
            }
        }
        return result;
    }
}