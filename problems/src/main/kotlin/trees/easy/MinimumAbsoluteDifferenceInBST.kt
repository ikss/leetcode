package trees.easy

import data_structures.TreeNode

/**
 * Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values
 * of any two different nodes in the tree.
 *
 * [URL](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)
 */
object MinimumAbsoluteDifferenceInBST {
    private var list = ArrayList<Int>()

    fun getMinimumDifference(root: TreeNode?): Int {
        list = ArrayList()
        inorderTraversal(root)

        var result = Int.MAX_VALUE
        for (i in 1 until list.size) {
            result = minOf(result, list[i] - list[i - 1])
        }

        return result
    }

    private fun inorderTraversal(node: TreeNode?) {
        if (node == null) return
        inorderTraversal(node.left)
        list.add(node.`val`)
        inorderTraversal(node.right)
    }
}
