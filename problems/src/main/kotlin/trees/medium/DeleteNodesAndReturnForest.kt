package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, each node in the tree has a distinct value.
 *
 * After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
 *
 * Return the roots of the trees in the remaining forest. You may return the result in any order.
 *
 * [URL](https://leetcode.com/problems/delete-nodes-and-return-forest/)
 */
object DeleteNodesAndReturnForest {
    fun delNodes(root: TreeNode?, to_delete: IntArray): List<TreeNode?> {
        if (root == null) return emptyList()
        if (to_delete.isEmpty()) return listOf(root)

        val toDelete = to_delete.toSet()

        val result = ArrayList<TreeNode>()
        if (root.`val` !in toDelete) {
            result.add(root)
        }
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val curr = queue.poll()

            curr.left?.let {
                queue.offer(it)
                if (it.`val` in toDelete) {
                    curr.left = null
                }
            }

            curr.right?.let {
                queue.offer(it)
                if (it.`val` in toDelete) {
                    curr.right = null
                }
            }
            if (curr.`val` in toDelete) {
                curr.left?.let(result::add)
                curr.right?.let(result::add)
            }
        }

        return result
    }
}
