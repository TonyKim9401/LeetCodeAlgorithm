class TrieNode {
    TrieNode[] childNode;
    boolean isEndOfWord;
    
    public TrieNode() {
        childNode = new TrieNode[26];
        isEndOfWord = false;
    }
}

class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.childNode[idx] == null) {
                node.childNode[idx] = new TrieNode();
            }
            node = node.childNode[idx];
        }
        node.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return searchInNode(word.toCharArray(), 0, root);
    }

    private boolean searchInNode(char[] word, int idx, TrieNode node) {
        if (idx == word.length) return node.isEndOfWord;

        char c = word[idx];

        if (c == '.') {
            for (TrieNode child : node.childNode) {
                if (child != null && searchInNode(word, idx+1, child)) return true;
            }
            return false;
        } else {
            int childIdx = c - 'a';
            if (node.childNode[childIdx] == null) return false;
            return searchInNode(word, idx+1, node.childNode[childIdx]);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */