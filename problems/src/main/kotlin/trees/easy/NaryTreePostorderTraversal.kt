package trees.easy

import data_structures.NaryTreeNode

/**
 * Given the root of an n-ary tree, return the postorder traversal of its nodes' values.
 *
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value
 *
 * [URL](https://leetcode.com/problems/n-ary-tree-postorder-traversal/)
 */
object NaryTreePostorderTraversal {
    fun postorder(root: NaryTreeNode?): List<Int> {
        if (root == null) return emptyList()

        val result = ArrayList<Int>()
        traverse(root, result)
        return result
    }

    private fun traverse(node: NaryTreeNode?, result: ArrayList<Int>) {
        if (node == null) return
        for (c in node.children) {
            traverse(c, result)
        }
        result.add(node.`val`)
    }
}
