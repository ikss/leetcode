package easy

import data_structures.TreeNode

/**
 * In a binary tree, a lonely node is a node that is the only child of its parent node.
 * The root of the tree is not lonely because it does not have a parent node.
 *
 * Given the root of a binary tree, return an array containing the values of all lonely nodes in the tree.
 * Return the list in any order.
 *
 * [URL](https://leetcode.com/problems/find-all-the-lonely-nodes/)
 */
object FindAllTheLonelyNodes {
    fun getLonelyNodes(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        val queue = java.util.ArrayDeque<Pair<TreeNode, Boolean>>()

        queue.offer(root to false)
        val result = ArrayList<Int>()

        while (queue.isNotEmpty()) {
            val (node, lonely) = queue.poll()
            if (lonely) {
                result.add(node.`val`)
            }
            node.left?.let { queue.offer(it to (node.right == null)) }
            node.right?.let { queue.offer(it to (node.left == null)) }
            
        }

        return result
    }
}
