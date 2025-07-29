// #caching with weak hashmap and linked Hashmap

// -> we weakhash map for cache keys that should expire if no longer referenced elsewhere.
// -> and linkedMap for maintaing insertion and access order with LRU eviction policy

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheExample<K, V> extends LinkedHashMap<K, V> {
    private final int MAX_ENTRIES;

    public LRUCacheExample(int maxEntries) {
        super(maxEntries, 0.75f, true);
        this.MAX_ENTRIES = maxEntries;
    }

    // This method MUST match the exact method signature from LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }
}

class Main {
    public static void main(String[] args) {
        LRUCacheExample<String, Object> cache = new LRUCacheExample<>(3);

        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);
        cache.get("one");           // Access "one" to refresh its position
        cache.put("four", "Data");  // Should evict "two" as LRU

        System.out.println(cache);  // Output will respect LRU order
    }
}

// Goal:
// You want to design a cache that holds fixed number of entries.
// When the cache becomes full, it removes the least recently used entry, whenever a new item is added.

// S/F:
// Create a custom LRU cache class extending LinkedHashMap.

// ↳ least recent use

// ↳ constructor call → 3rd param: true

// → the map maintains elements in access order
// → so every call to get() / put() moves that key to the end
// → an existing entry is moved to end of the list making it recently used