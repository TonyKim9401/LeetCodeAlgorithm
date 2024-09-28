class Solution {
    public String removeDuplicateLetters(String s) {
        // stack -> setting return value
        // set -> checking duplication
        // int[26] -> check how many times letters are appered

        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>();
        int[] letterCount = new int[26];

        for (char c : s.toCharArray()) letterCount[c - 'a'] += 1;
        
        for (char c : s.toCharArray()) {
            letterCount[c - 'a'] -= 1;

            if (set.contains(c)) continue;

            while (
                !stack.isEmpty() && 
                stack.peek() > c && 
                letterCount[stack.peek() - 'a'] > 0) {
                
                set.remove(stack.pop());
            }

            stack.push(c);
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        
        return sb.toString();
    }
}