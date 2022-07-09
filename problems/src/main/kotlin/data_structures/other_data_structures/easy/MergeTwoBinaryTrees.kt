package data_structures.other_data_structures.easy

import data_structures.TreeNode

/**
 * You are given two binary trees root1 and root2.
 *
 * Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped
 * while the others are not. You need to merge the two trees into a new binary tree.
 * The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of the new tree.
 *
 * Return the merged tree.
 *
 * __Note:__ The merging process must start from the root nodes of both trees.
 *
 * [URL](https://leetcode.com/problems/merge-two-binary-trees/)
 */
object MergeTwoBinaryTrees {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null) return root2
        if (root2 == null) return root1

        val mergedNode = TreeNode(root1.`val` + root2.`val`)
        mergedNode.left = mergeTrees(root1.left, root2.left)
        mergedNode.right = mergeTrees(root1.right, root2.right)

        return mergedNode
    }
}
