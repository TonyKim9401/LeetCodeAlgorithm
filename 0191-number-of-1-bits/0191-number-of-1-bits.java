class Solution {
    public int hammingWeight(int n) {
        // n -> bit 변환
        // bit 안에 1 몇개인지 확인
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rest = n % 2;
            sb.append(rest);
            n /= 2;
        }
        int output = 0;
        String bitString = sb.toString();
        while (bitString.contains("1")) {
            output += 1;
            bitString = bitString.replaceFirst("1", "");
        }
        return output;
    }
}