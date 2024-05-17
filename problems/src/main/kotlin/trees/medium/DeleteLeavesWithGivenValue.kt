package trees.medium

import data_structures.TreeNode
import java.util.*

/**
 * Given a binary tree root and an integer target, delete all the leaf nodes with value target.
 * 
 * Note that once you delete a lea node with value target, if it's parent node becomes a leaf node and has the value
 * target, it should also be deleted (you need to continue doing that until you cannot)
 *
 * [URL](https://leetcode.com/problems/delete-leaves-with-given-value/)
 */
object DeleteLeavesWithGivenValue {
    fun removeLeafNodes(root: TreeNode?, target: Int): TreeNode? {
        if (root == null) return null

        root.left = removeLeafNodes(root.left, target)
        root.right = removeLeafNodes(root.right, target)

        if (root.left == null && root.right == null && root.`val` == target) {
            return null
        }

        return root
    }
}
