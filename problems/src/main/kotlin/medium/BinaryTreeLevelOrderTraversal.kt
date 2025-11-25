package medium

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 *
 * [URL](https://leetcode.com/problems/binary-tree-level-order-traversal/)
 */
object BinaryTreeLevelOrderTraversal {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val queue = ArrayDeque<Pair<Int, TreeNode>>()
        queue.add(1 to root)
        val result = mutableListOf<MutableList<Int>>()
        while (queue.peek() != null) {
            processQueue(queue, result)
        }
        return result
    }

    private fun processQueue(queue: ArrayDeque<Pair<Int, TreeNode>>, result: MutableList<MutableList<Int>>) {
        val (level, elem) = queue.poll()
        if (result.size < level) {
            result += mutableListOf<Int>()
        }
        result[level - 1].add(elem.`val`)
        if (elem.left != null) queue.add(level + 1 to elem.left!!)
        if (elem.right != null) queue.add(level + 1 to elem.right!!)
    }

    fun levelOrderSimple(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val queue = LinkedList<TreeNode>()
        val result = mutableListOf<List<Int>>()

        queue.offer(root)
        while (!queue.isEmpty()) {
            var size = queue.size
            val level = mutableListOf<Int>()
            while (size-- > 0) {
                val cur = queue.poll()
                level.add(cur!!.`val`)
                if (cur.left != null) queue.offer(cur.left)
                if (cur.right != null) queue.offer(cur.right)
            }
            result += level
        }

        return result
    }
}
