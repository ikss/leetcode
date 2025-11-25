package medium

import data_structures.NaryTreeNode
import java.util.*

/**
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 *
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated
 * by the null value (See examples).
 *
 * [URL](https://leetcode.com/problems/n-ary-tree-level-order-traversal/)
 */
object NaryTreeLevelOrderTraversal {
    fun levelOrder(root: NaryTreeNode?): List<List<Int>> {
        if (root == null) return emptyList()

        val result = LinkedList<List<Int>>()
        val queue = ArrayDeque<NaryTreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            val level = ArrayList<Int>(size)

            for (i in 0 until size) {
                val node = queue.poll()
                level.add(node.`val`)

                for (child in node.children) {
                    child?.let(queue::offer)
                }
            }
            result.add(level)
        }

        return result
    }
}
