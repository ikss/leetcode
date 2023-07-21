package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
 *
 * Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
 *
 * [URL](https://leetcode.com/problems/add-one-row-to-tree/)
 */
object MaximumLevelSumOfBinaryTree {
    fun maxLevelSum(root: TreeNode?): Int {
        root ?: return 0
        var sum = root.`val`
        var level = 1
        var curLevel = 1

        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            var levelSum = 0

            for (i in 0 until size) {
                val node = queue.poll() ?: continue
                levelSum += node.`val`

                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }

            if (levelSum > sum) {
                level = curLevel
                sum = levelSum
            }
            curLevel++
        }

        return level
    }
}
