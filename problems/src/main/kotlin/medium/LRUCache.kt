package medium

/**
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 * * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair
 * to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 *
 * The functions get and put must each run in O(1) average time complexity.
 *
 * [URL](https://leetcode.com/problems/lru-cache/)
 */
object LRUCache {
    class LRUCache(private val capacity: Int) {
        private val map = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
            override fun removeEldestEntry(eldest: Map.Entry<Int, Int>): Boolean {
                return size > capacity
            }
        }

        operator fun get(key: Int): Int {
            return map.getOrDefault(key, -1)
        }

        operator fun set(key: Int, value: Int) {
            map[key] = value
        }
    }

}