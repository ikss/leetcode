package easy

import java.util.*

/**
 * Design a HashMap without using any built-in hash table libraries.
 *
 * Implement the MyHashMap class:
 * * MyHashMap() initializes the object with an empty map.
 * * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map,
 * update the corresponding value.
 * * int get(int key) returns the value to which the specified key is mapped, or -1 if
 * this map contains no mapping for the key.
 * * void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 *
 * [URL](https://leetcode.com/problems/design-hashmap/)
 */
object DesignHashMap {
    class MyHashMap {
        private val bucketsSize = 16

        private data class Node(val key: Int, var value: Int)

        private val buckets = Array<LinkedList<Node>?>(bucketsSize) { null }

        fun put(key: Int, value: Int) {
            val index = getIndexOf(key)
            var bucket = buckets[index]
            if (bucket == null) {
                bucket = LinkedList()
                buckets[index] = bucket
            }
            val node = bucket.firstOrNull { it.key == key }
            if (node == null) {
                bucket.add(Node(key, value))
            } else {
                node.value = value
            }
        }

        fun get(key: Int): Int {
            val node = buckets[getIndexOf(key)]?.firstOrNull { it.key == key }
                ?: return -1
            return node.value
        }

        fun remove(key: Int) {
            val bucket = buckets[getIndexOf(key)]
            bucket?.removeIf { it.key == key }
        }

        private fun getIndexOf(key: Int): Int {
            return key % bucketsSize
        }
    }
}