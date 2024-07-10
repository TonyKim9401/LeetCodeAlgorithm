class Solution {
    private Map<Character, String> map = new HashMap<>();
    private List<String> output = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return List.of();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backtracking(digits, 0);
        return output;
    }

    public void backtracking(String digits, int idx){
        if (digits.length() == idx) {
            output.add(sb.toString());
            return;
        }

        String dial = map.get(digits.charAt(idx));
        for (char c : dial.toCharArray()){
            sb.append(c);
            backtracking(digits, idx+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}