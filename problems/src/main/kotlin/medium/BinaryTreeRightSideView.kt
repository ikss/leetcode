package medium

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 *
 * [URL](https://leetcode.com/problems/binary-tree-right-side-view/)
 */
object BinaryTreeRightSideView {
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        val res = mutableListOf<Int>()

        while (!queue.isEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val cur = queue.poll()
                if (size == 0) res.add(cur!!.`val`)
                if (cur.left != null) queue.offer(cur.left)
                if (cur.right != null) queue.offer(cur.right)
            }
        }

        return res
    }
}
