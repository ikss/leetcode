package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST.
 * If the given node has no in-order successor in the tree, return null.
 *
 * The successor of a node p is the node with the smallest key greater than p.val.
 *
 * [URL](https://leetcode.com/problems/inorder-successor-in-bst/)
 */
object InorderSuccessorInBST {
    private val dummy = TreeNode(Int.MAX_VALUE)

    fun inorderSuccessor(root: TreeNode?, p: TreeNode?): TreeNode? {
        if (root == null || p == null) return null
        val node = traverse(root, p.`val`)
        return if (node === dummy) null else node
    }

    private fun traverse(node: TreeNode?, p: Int): TreeNode? {
        if (node == null) {
            return null
        }
        if (node.`val` <= p) {
            return traverse(node.right, p)
        }

        val left = traverse(node.left, p) ?: dummy
        val right = traverse(node.right, p) ?: dummy

        return listOf(node, left, right).sortedWith { n1, n2 -> n1.`val` - n2.`val` }.firstOrNull { it.`val` > p }
    }
}
