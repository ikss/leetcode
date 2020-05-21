package week3

object KthSmallestInBST {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        if (root == null) return 0
        val countLeft = count(root.left) + 1
        return when {
            countLeft == k -> return root.`val`
            countLeft < k -> kthSmallest(root.right, k - countLeft)
            else -> kthSmallest(root.left, k)
        }
    }

    private fun count(root: TreeNode?): Int {
        if (root == null) return 0
        return count(root.left) + count(root.right) + 1
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
