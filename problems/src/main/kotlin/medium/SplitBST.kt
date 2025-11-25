package medium

import data_structures.TreeNode

/**
 * Given the root of a binary search tree (BST) and an integer target, split the tree into two subtrees where the first
 * subtree has nodes that are all smaller or equal to the target value, while the second subtree has all nodes that are
 * greater than the target value. It is not necessarily the case that the tree contains a node with the value target.
 *
 * Additionally, most of the structure of the original tree should remain. Formally, for any child c with parent p in
 * the original tree, if they are both in the same subtree after the split, then node c should still have the parent p.
 *
 * Return an array of the two roots of the two subtrees in order.
 *
 * [URL](https://leetcode.com/problems/split-bst/)
 */
object SplitBST {

    fun splitBST(root: TreeNode?, target: Int): Array<TreeNode?> {
        val dummySm = TreeNode(0)
        var curSm = dummySm
        val dummyLg = TreeNode(0)
        var curLg = dummyLg

        var curr = root
        var next: TreeNode?

        while (curr != null) {
            if (curr.`val` <= target) {
                curSm.right = curr
                curSm = curr

                next = curr.right

                curSm.right = null

            } else {
                curLg.left = curr
                curLg = curr

                next = curr.left

                curLg.left = null
            }
            curr = next
        }

        return arrayOf(dummySm.right, dummyLg.left)
    }
}
