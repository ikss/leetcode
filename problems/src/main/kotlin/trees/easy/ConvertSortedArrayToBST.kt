package trees.easy

import data_structures.TreeNode

/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 *
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 *
 * [URL](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
 */
object ConvertSortedArrayToBST {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return helper(nums, 0, nums.size - 1)
    }

    private fun helper(nums: IntArray, left: Int, right: Int): TreeNode? {
        if (left > right) {
            return null
        }
        val mid = left + (right - left) / 2
        val root = TreeNode(nums[mid])
        root.left = helper(nums, left, mid - 1)
        root.right = helper(nums, mid + 1, right)
        return root
    }
}
