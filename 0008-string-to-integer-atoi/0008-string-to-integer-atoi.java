class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        // 1. 공백 제거
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        // 2. 부호 처리
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. 숫자 추출 (StringBuilder 사용)
        StringBuilder sb = new StringBuilder();
        while (i < n && Character.isDigit(s.charAt(i))) {
            sb.append(s.charAt(i));
            i++;
        }

        if (sb.length() == 0) return 0;  // 숫자가 하나도 없으면 0

        // 4. 숫자로 변환 (오버플로우 처리)
        long num = 0;
        for (int j = 0; j < sb.length(); j++) {
            num = num * 10 + (sb.charAt(j) - '0');

            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) (sign * num);
    }
}
