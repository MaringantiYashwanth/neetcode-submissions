// class Node {
//     private int key;
//     private int val;
//     private Node prev;
//     private Node next;
//     public Node(int key, int val) {
//         this.key = key;
//         this.val = val;
//         this.prev = null;
//         this.next = null;
//     }
// }
class LRUCache {
    private final Map<Integer, Integer> cache;
    // creating a map with key and values as integers
    private int capacity; // creating a capacity variable

    public LRUCache(int capacity) {

        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            // removes the oldest key out
                return size() > LRUCache.this.capacity;
            }
        };
    }
    
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
    }
}
