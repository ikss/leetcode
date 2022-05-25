package collections.other_data_structures.easy

import data_structures.TreeNode
import kotlin.math.max

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * [URL](https://leetcode.com/problems/validate-binary-search-tree/)
 */
object MaximumDepthBT {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val left = maxDepth(root.left)
        val right = maxDepth(root.right)
        return max(left, right) + 1
    }
}
