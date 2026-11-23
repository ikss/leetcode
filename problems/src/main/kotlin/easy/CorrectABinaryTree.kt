package easy

import data_structures.TreeNode


/**
 * You have a binary tree with a small defect. There is exactly one invalid node where its right child incorrectly
 * points to another node at the same depth but to the invalid node's right.
 *
 * Given the root of the binary tree with this defect, root, return the root of the binary tree after removing this
 * invalid node and every node underneath it (minus the node it incorrectly points to).
 *
 * Custom testing:
 *
 * The test input is read as 3 lines:
 * * TreeNode root
 * * int fromNode (not available to correctBinaryTree)
 * * int toNode (not available to correctBinaryTree)
 *
 * After the binary tree rooted at root is parsed, the TreeNode with value of fromNode will have its right child pointer
 * pointing to the TreeNode with a value of toNode. Then, root is passed to correctBinaryTree.
 *
 * [URL](https://leetcode.com/problems/correct-a-binary-tree/)
 */
object CorrectABinaryTree {
    fun correctBinaryTree(root: TreeNode): TreeNode {
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        val seen = HashSet<Int?>()
        seen.add(root.`val`)

        var broken = -1
        while (!queue.isEmpty()) {
            val curr = queue.poll()

            if (curr.left != null) {
                if (!seen.add(curr.left!!.`val`)) {
                    broken = curr.`val`
                    break
                }
                queue.offer(curr.left!!)
            }
            if (curr.right != null) {
                if (!seen.add(curr.right!!.`val`)) {
                    broken = curr.`val`
                    break
                }
                queue.offer(curr.right!!)
            }
        }

        removeBroken(root, broken)
        return root
    }

    private fun removeBroken(node: TreeNode?, broken: Int): Boolean {
        if (node == null) {
            return false
        }
        if (node.left != null && node.left!!.`val` == broken) {
            node.left = null
            return true
        }
        if (node.right != null && node.right!!.`val` == broken) {
            node.right = null
            return true
        }

        return removeBroken(node.left, broken) || removeBroken(node.right, broken)
    }
}
