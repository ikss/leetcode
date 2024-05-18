package trees.medium

import data_structures.TreeNode

/**
 * You are given the root of a binary tree with n nodes where each node in the tree has node.val coins.
 * There are n coins in total throughout the whole tree.
 *
 * In one move, we may choose two adjacent nodes and move one coin from one node to another.
 * A move may be from parent to child, or from child to parent.
 *
 * Return the minimum number of moves required to make every node have exactly one coin.
 *
 * [URL](https://leetcode.com/problems/distribute-coins-in-binary-tree/)
 */
object DistributeCoinsInBinaryTree {
    private var moves = 0

    fun distributeCoins(root: TreeNode?): Int {
        moves = 0
        dfs(root)
        return moves
    }

    private fun dfs(node: TreeNode?): Int {
        if (node == null) return 0

        // Calculate the coins each subtree has available to exchange
        val leftCoins = dfs(node.left)
        val rightCoins = dfs(node.right)

        // Add the total number of exchanges to moves
        moves += Math.abs(leftCoins) + Math.abs(rightCoins)

        // The number of coins current has available to exchange
        return node.`val` - 1 + leftCoins + rightCoins
    }
}
