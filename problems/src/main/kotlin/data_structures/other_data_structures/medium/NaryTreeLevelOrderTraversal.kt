package data_structures.other_data_structures.medium

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
        val result = mutableListOf<List<Int>>()
        val queue = LinkedList<NaryTreeNode>()
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            val level = mutableListOf<Int>()
            repeat(levelSize) {
                val node = queue.poll()
                level.add(node.`val`)

                node.children.forEach {
                    if (it != null) queue.offer(it)
                }
            }
            result.add(level)
        }

        return result
    }
}
