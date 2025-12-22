package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the length of the longest consecutive path in the tree.
 *
 * A consecutive path is a path where the values of the consecutive nodes in the path differ by one.
 * This path can be either increasing or decreasing.
 *
 * * For example, `[1,2,3,4]` and `[4,3,2,1]` are both considered valid, but the path `[1,2,4,3]` is not valid.
 * On the other hand, the path can be in the child-Parent-child order, where not necessarily be parent-child order.
 *
 * [URL](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-ii/)
 */
object BinaryTreeLongestConsecutiveSequenceII {
    private data class State(
        val longest: Int,
        val longestIncOnNode: Int,
        val longestDecOnNode: Int,
    )

    fun longestConsecutive(root: TreeNode?): Int {
        val state = dfs(root)

        return state.longest
    }

    private fun dfs(node: TreeNode?): State {
        if (node == null) {
            return State(longest = 0, longestIncOnNode = 0, longestDecOnNode = 0)
        }

        var inc = 1
        var dec = 1
        var longest = 1

        val left = node.left
        val right = node.right

        if (left != null) {
            val leftState = dfs(left)

            if (left.`val` == node.`val` + 1) {
                inc = leftState.longestIncOnNode + 1
            } else if (left.`val` == node.`val` - 1) {
                dec = leftState.longestDecOnNode + 1
            }
            longest = maxOf(longest, leftState.longest)
        }

        if (right != null) {
            val rightState = dfs(right)

            if (right.`val` == node.`val` + 1) {
                inc = maxOf(inc, rightState.longestIncOnNode + 1)
            } else if (right.`val` == node.`val` - 1) {
                dec = maxOf(dec, rightState.longestDecOnNode + 1)
            }
            longest = maxOf(longest, rightState.longest)
        }

        return State(
            longest = maxOf(longest, inc + dec - 1),
            longestIncOnNode = inc,
            longestDecOnNode = dec,
        )

    }
}