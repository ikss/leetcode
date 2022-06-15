package data_structures.other_data_structures.easy

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * [URL](https://leetcode.com/problems/symmetric-tree/)
 */
object SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true

        val queue = ArrayDeque<Pair<TreeNode?, TreeNode?>>()
        queue.add(root.left to root.right)
        var result = true
        while (queue.peek() != null && result) {
            result = processQueue(queue)
        }
        return result
    }

    private fun processQueue(queue: ArrayDeque<Pair<TreeNode?, TreeNode?>>): Boolean {
        val (left, right) = queue.poll()
        if (left == null && right == null) return true
        if (left == null || right == null) return false
        if (left.`val` != right.`val`) return false

        queue.add(left.left to right.right)
        queue.add(left.right to right.left)
        return true
    }
}
