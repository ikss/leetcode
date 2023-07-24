package trees.medium

import data_structures.TreeNode

/**
 * Given an integer n, return a list of all possible full binary trees with n nodes.
 * Each node of each tree in the answer must have Node.val == 0.
 *
 * Each element of the answer is the root node of one possible tree. You may return the final list of trees in any order.
 *
 * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
 *
 * [URL](https://leetcode.com/problems/all-possible-full-binary-trees/)
 */
object AllPossibleFullBinaryTrees {
    fun allPossibleFBT(n: Int): List<TreeNode?> {
        if (n % 2 == 0) return emptyList()

        val dp = Array<ArrayList<TreeNode>>(n + 1) { ArrayList() }

        dp[1].add(TreeNode(0))
        for (count in 3..n step 2) {
            for (i in 1 until count - 1 step 2) {
                val j = count - i - 1
                for (left in dp[i]) {
                    for (right in dp[j]) {
                        val root = TreeNode(0, left, right)
                        dp[count].add(root)
                    }
                }
            }
        }

        return dp[n]
    }
}
