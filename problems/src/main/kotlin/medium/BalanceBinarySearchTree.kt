package medium

import data_structures.TreeNode

/**
 * Given the root of a binary search tree, return a balanced binary search tree with the same node values.
 * If there is more than one answer, return any of them.
 *
 * A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.
 *
 * [URL](https://leetcode.com/problems/balance-a-binary-search-tree/)
 */
object BalanceBinarySearchTree {
    fun balanceBST(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val list = ArrayList<Int>()
        fillElements(root, list)
        return split(list, 0, list.size - 1)
    }

    private fun fillElements(root: TreeNode?, list: ArrayList<Int>) {
        if (root == null) return
        fillElements(root.left, list)
        list.add(root.`val`)
        fillElements(root.right, list)
    }

    private fun split(elements: List<Int>, start: Int, end: Int): TreeNode? {
        if (start > end) return null
        val mid = (end - start) / 2 + start
        val node = TreeNode(elements[mid])
        node.left = split(elements, start, mid - 1)
        node.right = split(elements, mid + 1, end)
        return node
    }
}
