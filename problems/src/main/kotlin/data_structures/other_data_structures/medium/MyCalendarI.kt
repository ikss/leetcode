package data_structures.other_data_structures.medium

import java.util.*

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 *
 * [URL](https://leetcode.com/problems/binary-tree-level-order-traversal/)
 */
class MyCalendarI {
    private val calendar = TreeSet<Pair<Int, Int>> { a, b -> a.first - b.first }

    fun book(start: Int, end: Int): Boolean {
        if (calendar.isNotEmpty()) {
            val pair = start to end
            val floor = calendar.floor(pair)
            if (floor != null && floor.second > start) {
                return false
            }
            val ceil = calendar.ceiling(pair)
            if (ceil != null && ceil.first < end) {
                return false
            }
        }
        calendar.add(start to end)
        return true
    }
}
