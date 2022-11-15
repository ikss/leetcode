package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 *
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
 * and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 *
 * Design an algorithm that runs in less than O(n) time complexity.
 *
 * [URL](https://leetcode.com/problems/count-complete-tree-nodes/
 */
object CountCompleteTreeNodes {
    fun countNodes(root: TreeNode?): Int {
        if (root == null) return 0
        var left = root
        var right = root
        var height = 0
        while (right != null) {
            left = left!!.left
            right = right.right
            height++
        }
        if (left == null) {
            return (1 shl height) - 1
        }
        return 1 + countNodes(root.left) + countNodes(root.right)
    }
}
