package easy

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * [URL](https://leetcode.com/problems/symmetric-tree/)
 */
object SymmetricTree {
    fun isSymmetricQueue(root: TreeNode?): Boolean {
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

    fun isSymmetricRecursive(root: TreeNode?): Boolean {
        if (root == null) return true

        return checkReversed(root.left, root.right)
    }

    private fun checkReversed(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left?.`val` != right?.`val`) return false
        return checkReversed(left?.left, right?.right) && checkReversed(left?.right, right?.left)
    }
}
