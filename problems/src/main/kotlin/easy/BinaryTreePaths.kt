package easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 *
 * A leaf is a node with no children.
 *
 * [URL](https://leetcode.com/problems/binary-tree-paths/)
 */
object BinaryTreePaths {

    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) return emptyList()
        val result = ArrayList<String>()

        traverse(root, StringBuilder(), result)
        return result
    }

    private fun traverse(node: TreeNode, currPath: StringBuilder, result: ArrayList<String>) {
        val length = currPath.length
        if (length > 0) {
            currPath.append("->")
        }
        currPath.append(node.`val`)

        if (node.left != null || node.right != null) {
            node.left?.let { traverse(it, currPath, result) }
            node.right?.let { traverse(it, currPath, result) }
        } else {
            result.add(currPath.toString())
        }
        currPath.setLength(length)
    }
}
