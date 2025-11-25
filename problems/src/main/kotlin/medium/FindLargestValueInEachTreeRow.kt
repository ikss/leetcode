package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 *
 * [URL](https://leetcode.com/problems/find-largest-value-in-each-tree-row/)
 */
object FindLargestValueInEachTreeRow {
    fun largestValues(root: TreeNode?): List<Int> {
        root ?: return emptyList()
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        val result = ArrayList<Int>()

        while (queue.isNotEmpty()) {
            val size = queue.size
            var max = Int.MIN_VALUE
            for (i in 0 until size) {
                val elem = queue.poll()!!
                max = maxOf(max, elem.`val`)
                elem.left?.let { queue.offer(it) }
                elem.right?.let { queue.offer(it) }
            }
            result.add(max)
        }

        return result
    }
}
