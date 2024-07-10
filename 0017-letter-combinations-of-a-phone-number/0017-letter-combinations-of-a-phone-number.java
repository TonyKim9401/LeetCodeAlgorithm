class Solution {
    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        if (length == 0) return List.of();

        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> output = new ArrayList<>();
        backtracking(digits, 0, new StringBuilder(), output, map);
        return output;
    }

    public void backtracking(String digits, int idx, StringBuilder sb, List<String> output, Map<Character, String> map) {
        if (digits.length() == idx) {
            output.add(sb.toString());
            return;
        }
        
        String dials = map.get(digits.charAt(idx));
        for(char c : dials.toCharArray()) {
            sb.append(c);
            backtracking(digits, idx+1, sb, output, map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}