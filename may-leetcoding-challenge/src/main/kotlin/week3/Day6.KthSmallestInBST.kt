package week3

import data_structures.TreeNode

object KthSmallestInBST {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        if (root == null) return 0

        val countLeft = count(root.left) + 1
        return when {
            countLeft == k -> root.`val`
            countLeft < k -> kthSmallest(root.right, k - countLeft)
            else -> kthSmallest(root.left, k)
        }
    }

    private fun count(root: TreeNode?): Int {
        if (root == null) return 0
        return count(root.left) + count(root.right) + 1
    }

}
