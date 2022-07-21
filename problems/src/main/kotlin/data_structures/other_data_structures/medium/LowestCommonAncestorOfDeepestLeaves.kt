package data_structures.other_data_structures.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the lowest common ancestor of its deepest leaves.
 *
 * Recall that:
 *
 * * The node of a binary tree is a leaf if and only if it has no children
 * * The depth of the root of the tree is 0. if the depth of a node is d, the depth of each of its children is d + 1.
 * * The lowest common ancestor of a set S of nodes, is the node A with the largest depth such that every node in S is in the subtree with root A.
 *
 * [URL](https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/)
 */
object LowestCommonAncestorOfDeepestLeaves {
    fun lcaDeepestLeaves(root: TreeNode?): TreeNode? {
        val p = getLca(root, 0)
        return p.first
    }

    private fun getLca(root: TreeNode?, d: Int): Pair<TreeNode?, Int> {
        if (root == null) {
            return Pair(null, d)
        }
        val l = getLca(root.left, d + 1)
        val r = getLca(root.right, d + 1)

        return if (l.second == r.second) {
            Pair(root, l.second)
        } else {
            if (l.second > r.second) l else r
        }
    }
}
