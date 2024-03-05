import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // find the shortest word after sorting
        // use for-loop depends on the length of the shortest word's length
        // check prefix and add that using StringBuilder to rapid it
        Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());
        
        String shortest = strs[0];
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < shortest.length(); i++) {
            boolean check = true;
            char head = shortest.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char other = strs[j].charAt(i);
                if (head != other) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result.append(String.valueOf(head));
            } else {
                break;
            }
        }
        return result.toString();
    }
}