package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the maximum width of the given tree.
 *
 * The maximum width of a tree is the maximum width among all levels.
 *
 * The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes),
 * where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that
 * level are also counted into the length calculation.
 *
 * It is guaranteed that the answer will in the range of a 32-bit signed integer.
 *
 * [URL](https://leetcode.com/problems/maximum-width-of-binary-tree/)
 */
object MaximumWidthOfBinaryTree {
    fun widthOfBinaryTree(root: TreeNode?): Int {
        root ?: return 0
        var result = 0
        val q = java.util.ArrayDeque<Pair<Int, TreeNode>>()
        q.offer(0 to root)

        while (q.isNotEmpty()) {
            val size = q.size
            var indexFirst = 0
            var indexLast = 0
            for (i in 0 until size) {
                val (index, node) = q.poll()
                if (i == 0) indexFirst = index
                if (i == size - 1) indexLast = index

                node.left?.let { q.offer(index * 2 to it) }
                node.right?.let { q.offer(index * 2 + 1 to it) }
            }
            result = maxOf(result, indexLast - indexFirst + 1)
        }

        return result
    }
}
