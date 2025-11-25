package medium

import data_structures.TreeNode

/**
 * Given the root of a perfect binary tree, reverse the node values at each odd level of the tree.
 * * For example, suppose the node values at level 3 are `[2,1,3,4,7,11,29,18]`,
 * then it should become `[18,29,11,7,4,3,1,2]`.
 *
 * Return the root of the reversed tree.
 *
 * A binary tree is perfect if all parent nodes have two children and all leaves are on the same level.
 *
 * The level of a node is the number of edges along the path between it and the root node.
 *
 * [URL](https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/)
 */
object ReverseOddLevelsOfBinaryTree {
    fun reverseOddLevels(root: TreeNode?): TreeNode? {
        if (root == null) return null
        traverseDfs(root.left, root.right, 0)
        return root
    }

    private fun traverseDfs(left: TreeNode?, right: TreeNode?, level: Int) {
        if (left == null || right == null) return

        if (level % 2 == 0) {
            val temp = left.`val`
            left.`val` = right.`val`
            right.`val` = temp
        }
        traverseDfs(left.left, right.right, level + 1)
        traverseDfs(left.right, right.left, level + 1)
    }
}
