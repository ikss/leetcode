package medium

import data_structures.TreeNode

/**
 * Given the roots of two binary search trees, root1 and root2, return true if and only if there is a node in the first
 * tree and a node in the second tree whose values sum up to a given integer target.
 *
 * [URL](https://leetcode.com/problems/two-sum-bsts/)
 */
object TwoSumBSTs {
    fun twoSumBSTs(root1: TreeNode?, root2: TreeNode?, target: Int): Boolean {
        val set = HashSet<Int>()
        collectNodesToSet(root2, set)

        return dfsCheck(root1, set, target)
    }

    private fun collectNodesToSet(root: TreeNode?, set: HashSet<Int>) {
        if (root == null) return

        set.add(root.`val`)
        collectNodesToSet(root.left, set)
        collectNodesToSet(root.right, set)
    }

    private fun dfsCheck(root: TreeNode?, set: Set<Int>, target: Int): Boolean {
        if (root == null) return false

        if (target - root.`val` in set) return true

        return dfsCheck(root.left, set, target) || dfsCheck(root.right, set, target)
    }
}
