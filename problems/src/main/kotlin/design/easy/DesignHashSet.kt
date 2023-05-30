package design.easy

import java.util.*

/**
 * Design a HashSet without using any built-in hash table libraries.
 *
 * Implement MyHashSet class:
 * * void add(key) Inserts the value key into the HashSet.
 * * bool contains(key) Returns whether the value key exists in the HashSet or not.
 * * void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 *
 * [URL](https://leetcode.com/problems/design-hashset/)
 */
object DesignHashSet {
    class MyHashSet {
        var num = BitSet(1_000_000)

        fun add(key: Int) {
            num.set(key)
        }

        fun remove(key: Int) {
            num.clear(key)
        }

        operator fun contains(key: Int): Boolean {
            return num.get(key)
        }
    }
}