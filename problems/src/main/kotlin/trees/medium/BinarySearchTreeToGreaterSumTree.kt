package trees.medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST
 * is changed to the original key plus the sum of all keys greater than the original key in BST.
 *
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 * * The left subtree of a node contains only nodes with keys less than the node's key.
 * * The right subtree of a node contains only nodes with keys greater than the node's key.
 * * Both the left and right subtrees must also be binary search trees.
 *
 * [URL](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/)
 */
object BinarySearchTreeToGreaterSumTree {
    fun bstToGst(root: TreeNode?): TreeNode? {
        if (root == null) return root

        traverse(root, 0)
        return root
    }

    private fun traverse(node: TreeNode?, additionalSum: Int): Int {
        if (node == null) return additionalSum

        val newVal = node.`val` + traverse(node.right, additionalSum)
        node.`val` = newVal
        return traverse(node.left, newVal)
    }
}