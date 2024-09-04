package trees.medium

import data_structures.TreeNode
import java.util.*

/**
 * You are given the root of a binary tree and a positive integer k.
 *
 * The level sum in the tree is the sum of the values of the nodes that are on the same level.
 *
 * Return the kth largest level sum in the tree (not necessarily distinct).
 * If there are fewer than k levels in the tree, return -1.
 *
 * Note that two nodes are on the same level if they have the same distance from the root.
 *
 * [URL](https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/)
 */
object KthLargestSumInBinaryTree {
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        if (root == null) return -1L
        val queue = PriorityQueue<Long>()

        val nodes = ArrayDeque<TreeNode>()
        nodes.offer(root)

        while (nodes.isNotEmpty()) {
            val size = nodes.size
            var sum = 0L

            for (i in 1 .. size) {
                val node = nodes.poll()
                sum += node.`val`
                node.left?.let(nodes::offer)
                node.right?.let(nodes::offer)
            }

            queue.offer(sum)
            if (queue.size > k) queue.poll()
        }

        return if (queue.size < k) -1L else queue.poll()
    }
}
