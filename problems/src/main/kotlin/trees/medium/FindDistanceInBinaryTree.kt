package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree and two integers p and q,
 * return the distance between the nodes of value p and value q in the tree.
 *
 * The distance between two nodes is the number of edges on the path from one to the other.
 *
 * [URL](https://leetcode.com/problems/find-distance-in-a-binary-tree/)
 */
object FindDistanceInBinaryTree {
    fun findDistance(root: TreeNode?, p: Int, q: Int): Int {
        val lca = findLCA(root, p, q) ?: return -1

        val queue = java.util.ArrayDeque<TreeNode>()
        queue.add(lca)

        var distance = 0
        var depth = 0
        var foundp = false
        var foundq = false

        while (queue.size > 0 && !(foundp && foundq)) {
            val size = queue.size

            for (i in 0 until size) {
                val front = queue.poll()
                if (front.`val` == p) {
                    distance += depth
                    foundp = true
                }
                if (front.`val` == q) {
                    distance += depth
                    foundq = true
                }
                front.left?.let(queue::add)
                front.right?.let(queue::add)
            }
            depth++
        }

        return distance
    }

    private fun findLCA(node: TreeNode?, p: Int, q: Int): TreeNode? {
        if (node == null) {
            return null
        }
        if (node.`val` == p || node.`val` == q) {
            return node
        }

        val left = findLCA(node.left, p, q)
        val right = findLCA(node.right, p, q)

        if (left != null && right != null) {
            return node
        }
        return left ?: right
    }
}
