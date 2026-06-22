/**
 * Problem: Design Hash Set (#705)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/design-hash-set/
 */
class MyHashSet {
       boolean[] set;
    public MyHashSet() {
       set=new boolean[1000001];
    }
    
    public void add(int key) {
        set[key]=true;
    }
    
    public void remove(int key) {
        set[key]=false;
    }
    
    public boolean contains(int key) {
        return set[key];    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
