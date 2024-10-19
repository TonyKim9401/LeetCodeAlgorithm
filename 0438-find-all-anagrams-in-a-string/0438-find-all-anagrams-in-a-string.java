class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<>();
        if (p.length() > s.length()) return List.of();

        int[] originalCount = new int[26];
        for (char c : p.toCharArray()) {
            originalCount[c - 'a'] += 1;
        }

        int slidingWindow = p.length();
        int[] compareCount = new int[26];

        for (int i = 0; i < slidingWindow; i++) {
            compareCount[s.charAt(i) - 'a'] += 1;
        }

        if (Arrays.equals(originalCount, compareCount)) output.add(0);

        for (int i = 1; i <= s.length() - slidingWindow; i++) {
            compareCount[s.charAt(i - 1) - 'a'] -= 1;
            compareCount[s.charAt(i + slidingWindow - 1) - 'a'] += 1;
            if (Arrays.equals(originalCount, compareCount)) output.add(i);
        }
        
        return output;
    }
}