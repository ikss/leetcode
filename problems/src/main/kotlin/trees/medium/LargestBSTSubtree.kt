package trees.medium

import data_structures.TreeNode
import kotlin.math.max

/**
 * Given the root of a binary tree, find the largest subtree, which is also a Binary Search Tree (BST),
 * where the largest means subtree has the largest number of nodes.
 *
 * A Binary Search Tree (BST) is a tree in which all the nodes follow the below-mentioned properties:
 * * The left subtree values are less than the value of their parent (root) node's value.
 * * The right subtree values are greater than the value of their parent (root) node's value.
 *
 * Note: A subtree must include all of its descendants.
 *
 * [URL](https://leetcode.com/problems/largest-bst-subtree/)
 */
object LargestBSTSubtree {
    private data class NodeValue(var minNode: Int, var maxNode: Int, var maxSize: Int)

    fun largestBSTSubtree(root: TreeNode?): Int {
        return largestBSTSubtreeHelper(root).maxSize
    }

    private fun largestBSTSubtreeHelper(root: TreeNode?): NodeValue {
        if (root == null) {
            return NodeValue(Int.MAX_VALUE, Int.MIN_VALUE, 0)
        }

        val left = largestBSTSubtreeHelper(root.left)
        val right = largestBSTSubtreeHelper(root.right)


        if (left.maxNode < root.`val` && root.`val` < right.minNode) {
            return NodeValue(
                minOf(root.`val`, left.minNode), maxOf(root.`val`, right.maxNode),
                left.maxSize + right.maxSize + 1
            )
        }

        return NodeValue(
            Int.MIN_VALUE, Int.MAX_VALUE,
            max(left.maxSize, right.maxSize)
        )
    }
}
