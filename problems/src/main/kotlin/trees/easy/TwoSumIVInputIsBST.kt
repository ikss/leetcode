package trees.easy

import data_structures.TreeNode

/**
 * Given the root of a Binary Search Tree and a target number k,
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 *
 * [URL](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)
 */
object TwoSumIVInputIsBST {
    private var set = mutableSetOf<Int>()

    fun findTarget(root: TreeNode?, k: Int): Boolean {
        set = mutableSetOf()
        if (root == null) return false
        return dfs(root, k)
    }

    private fun dfs(node: TreeNode?, k: Int): Boolean {
        if (node == null) return false
        if (set.contains(k - node.`val`)) return true
        set.add(node.`val`)
        return dfs(node.left, k) || dfs(node.right, k)
    }
}
