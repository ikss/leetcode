package easy

import data_structures.TreeNode

/**
 * Given the root of a Binary Search Tree (BST), return the minimum difference between
 * the values of any two different nodes in the tree.
 *
 * [URL](https://leetcode.com/problems/minimum-distance-between-bst-nodes/)
 */
object MinimumDistanceBetweenBSTNodes {
    private var minDistance = Int.MAX_VALUE

    // Initially, it will be null.
    private var prevValue: TreeNode? = null

    fun minDiffInBST(root: TreeNode?): Int {
        minDistance = Int.MAX_VALUE
        prevValue = null
        inorderTraversal(root)
        return minDistance
    }

    private fun inorderTraversal(root: TreeNode?) {
        if (root == null) {
            return
        }
        inorderTraversal(root.left)

        // Find the difference with the previous value if it is there.
        if (prevValue != null) {
            minDistance = Math.min(minDistance, root.`val` - prevValue!!.`val`)
        }
        prevValue = root
        inorderTraversal(root.right)
    }
}