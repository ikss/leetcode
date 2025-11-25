package easy

import data_structures.NaryTreeNode

/**
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value
 *
 * [URL](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/)
 */
object MaximumDepthOfNaryTree {
    fun maxDepth(root: NaryTreeNode?): Int {
        if (root == null) return 0

        var result = 0

        for (c in root.children) {
            result = maxOf(result, maxDepth(c))
        }

        return result + 1
    }
}
