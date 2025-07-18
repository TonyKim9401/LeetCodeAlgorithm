class MyHashSet {

    List<Integer> set;

    public MyHashSet() {
        this.set = new ArrayList<>();
    }
    
    public void add(int key) {
        if (this.set.contains(key)) return;
        this.set.add(key);
    }
    
    public void remove(int key) {
        if (this.set.contains(key)) {
            this.set.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        if (this.set.contains(key)) return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */