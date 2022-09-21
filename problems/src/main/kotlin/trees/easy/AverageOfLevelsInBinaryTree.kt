package trees.easy

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
 * Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/average-of-levels-in-binary-tree/)
 */
object AverageOfLevelsInBinaryTree {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        if (root == null) return doubleArrayOf()

        val result = mutableListOf<Double>()
        val queue = LinkedList<TreeNode>()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val size = queue.size
            var sum = 0.0
            repeat(size) {
                val node = queue.poll()
                sum += node.`val`
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            result.add(sum / size)
        }
        return result.toDoubleArray()
    }
}
