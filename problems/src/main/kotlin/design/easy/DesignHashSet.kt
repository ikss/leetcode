package design.easy

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
        var num = LongArray(15626)

        fun add(key: Int) {
            num[getIdx(key)] = num[getIdx(key)] or getMask(key)
        }

        fun remove(key: Int) {
            num[getIdx(key)] = num[getIdx(key)] and getMask(key).inv()
        }

        operator fun contains(key: Int): Boolean {
            return num[getIdx(key)] and getMask(key) != 0L
        }

        private fun getIdx(key: Int): Int {
            return key / 64
        }

        private fun getMask(key: Int): Long {
            return 1L shl (key % 64)
        }
    }
}