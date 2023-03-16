package trees.medium

import data_structures.TreeNode
import java.util.*


/**
 * Given the root of a binary tree, determine if it is a complete binary tree.
 *
 * In a complete binary tree, every level, except possibly the last, is completely filled,
 * and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 *
 * [URL](https://leetcode.com/problems/check-completeness-of-a-binary-tree/)
 */
object CheckCompletenessOfBinaryTree {
    fun isCompleteTree(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        var nullNodeFound = false
        val q = LinkedList<TreeNode?>()
        q.offer(root)
        while (!q.isEmpty()) {
            val node = q.poll()
            if (node == null) {
                nullNodeFound = true
                continue
            }
            if (nullNodeFound) {
                return false
            }
            q.offer(node.left)
            q.offer(node.right)
        }
        return true
    }
}
