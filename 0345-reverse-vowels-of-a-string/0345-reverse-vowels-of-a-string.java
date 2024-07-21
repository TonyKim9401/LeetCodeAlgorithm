class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;

        String v = "aeiouAEIOU";
        char[] sArr = s.toCharArray();

        while (i < j) {
            char a = sArr[i];
            char b = sArr[j];

            if (v.contains(String.valueOf(a)) && v.contains(String.valueOf(b))) {
                char temp = sArr[j];
                sArr[j] = sArr[i];
                sArr[i] = temp;
                i += 1;
                j -= 1;
                continue;
            } else if (v.contains(String.valueOf(a))) {
                j -= 1;
                continue;
            } else if (v.contains(String.valueOf(b))) {
                i += 1;
                continue;
            }
            i += 1;
            j -= 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < sArr.length; k++) {
            sb.append(sArr[k]);
        }
        return sb.toString();
    }
}