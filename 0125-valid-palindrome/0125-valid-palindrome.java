class Solution {
    public boolean isPalindrome(String s) {
        
        // 공백 없애기
        // 특문 없애기
        // 대 -> 소문자
        // 1/2 나눠서 앞뒤 비교

        while(s.contains(" ")) {
            s = s.replace(" ", "");
        }

        Map<Character, Character> map = new HashMap<>();
        char uc = 'A';
        char dc = 'a';
        for (int i = 0; i < 27; i++) {
            map.put((char)(uc + i), (char)(dc + i));
        }
        
        String alphanumeric = "`~!@#$%^&*()-_=+[]{}'\";:/?.>,<";
        for (char c : s.toCharArray()) {
            if (alphanumeric.contains(String.valueOf(c))) {
                s = s.replace(String.valueOf(c), "");
            } 
        }

        for (Character c : map.keySet()) {
            if (s.contains(String.valueOf(c))) {
                s = s.replaceAll(String.valueOf(c), String.valueOf(map.get(c)));
            }
        }

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
}