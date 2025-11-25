package easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, replace the value of each node in the tree with the sum of all its cousins' values.
 *
 * Two nodes of a binary tree are cousins if they have the same depth with different parents.
 *
 * Return the root of the modified tree.
 *
 * Note that the depth of a node is the number of edges in the path from the root node to it.
 *
 * [URL](https://leetcode.com/problems/cousins-in-binary-tree/)
 */
object CousinsInBinaryTree {
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null) return false
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            val nodeToParent = HashMap<Int, TreeNode>()

            for (i in 0 until size) {
                val curr = queue.poll()

                curr.left?.let {
                    queue.offer(it)
                    nodeToParent[it.`val`] = curr
                }
                curr.right?.let {
                    queue.offer(it)
                    nodeToParent[it.`val`] = curr
                }
            }
            val first = nodeToParent[x]
            val second = nodeToParent[y]
            if (first != null || second != null) {
                return first != null && second != null && first !== second
            }
        }

        return false
    }
}
