package easy

import data_structures.NaryTreeNode

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 *
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value
 *
 * [URL](https://leetcode.com/problems/n-ary-tree-preorder-traversal/)
 */
object NaryTreePreorderTraversal {
    fun preorder(root: NaryTreeNode?): List<Int> {
        if (root == null) return emptyList()

        val result = ArrayList<Int>()

        result.add(root.`val`)
        for (c in root.children) {
            traverse(c, result)
        }

        return result
    }

    private fun traverse(node: NaryTreeNode?, result: ArrayList<Int>) {
        if (node == null) return
        
        result.add(node.`val`)
        for (c in node.children) {
            traverse(c, result)
        }
    }
}
