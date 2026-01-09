package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, the depth of each node is the shortest distance to the root.
 *
 * Return the smallest subtree such that it contains all the deepest nodes in the original tree.
 *
 * A node is called the deepest if it has the largest depth possible among any node in the entire tree.
 *
 * The subtree of a node is a tree consisting of that node, plus the set of all descendants of that node.
 *
 * [URL](https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/)
 */
object SmallestSubtreeWithAllTheDeepestNodes {
    fun subtreeWithAllDeepest(root: TreeNode?): TreeNode? {
        return deepestNode(root, 0).first
    }

    private fun deepestNode(node: TreeNode?, depth: Int): Pair<TreeNode?, Int> {
        if (node == null) return null to depth - 1

        val deepestLeft = deepestNode(node.left, depth + 1)
        val deepestRight = deepestNode(node.right, depth + 1)

        if (deepestLeft.second == deepestRight.second) {
            return node to deepestLeft.second
        } else if (deepestLeft.second > deepestRight.second) {
            return deepestLeft
        } else {
            return deepestRight
        }
    }
}
