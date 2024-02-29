package trees.medium

import data_structures.TreeNode

/**
 * A binary tree is named Even-Odd if it meets the following conditions:
 * * The root of the binary tree is at level index 0, its children are at level index 1,
 * their children are at level index 2, etc.
 * * For every even-indexed level, all nodes at the level have odd integer values in
 * strictly increasing order (from left to right).
 * * For every odd-indexed level, all nodes at the level have even integer values in
 * strictly decreasing order (from left to right).
 *
 * Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.
 *
 * [URL](https://leetcode.com/problems/even-odd-tree/)
 */
object EvenOddTree {
    fun isEvenOddTree(root: TreeNode): Boolean {
        var level = 0
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            val even = level % 2 == 0
            var curr = if (even) Int.MIN_VALUE else Int.MAX_VALUE
            for (i in 0 until size) {
                val next = queue.poll()
                if (even) {
                    if (curr >= next.`val` || next.`val` % 2 == 0) {
                        return false
                    }
                } else if (curr <= next.`val` || next.`val` % 2 != 0) {
                    return false
                }
                curr = next.`val`
                next.left?.let(queue::offer)
                next.right?.let(queue::offer)
            }
            level++
        }

        return true
    }
}
