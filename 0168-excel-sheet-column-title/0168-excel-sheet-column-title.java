class Solution {
    public String convertToTitle(int columnNumber) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            map.put(i, String.valueOf((char)('A'+i-1)));
        }
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 26) {
            int key = columnNumber % 26;
            if (key == 0) {
                key = 26;
                columnNumber -= 1;
            }
            sb.append(map.get(key));
            columnNumber /= 26;
        }
        if (columnNumber <= 26) {
            sb.append(map.get(columnNumber));
        }
        return sb.reverse().toString();
    }
}