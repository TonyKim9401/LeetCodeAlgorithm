class Trie {

    private List<String> store;

    public Trie() {
        store = new ArrayList<>();
    }
    
    public void insert(String word) {
        store.add(word);
    }
    
    public boolean search(String word) {
        return store.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        for (String str : store) {
            if (str.startsWith(prefix)) return true;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */