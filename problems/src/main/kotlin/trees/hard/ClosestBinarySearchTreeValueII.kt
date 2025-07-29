package trees.hard

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary search tree, a target value, and an integer k,
 * return the k values in the BST that are closest to the target. You may return the answer in any order.
 *
 * You are guaranteed to have only one unique set of k values in the BST that are closest to the target.
 *
 * [URL](https://leetcode.com/problems/closest-binary-search-tree-value-ii/)
 */
object ClosestBinarySearchTreeValueII {
    private class QueueWrapper(val target: Double, val k: Int) {
        val queue = PriorityQueue<Pair<Double, Int>> { p1, p2 -> p2.first.compareTo(p1.first) }

        fun offer(num: Int) {
            val diff = Math.abs(target - num)
            queue.offer(diff to num)
            if (queue.size > k) {
                queue.poll()
            }
        }
    }

    fun closestKValues(root: TreeNode?, target: Double, k: Int): List<Int> {
        if (root == null) return emptyList()
        val queueWrapper = QueueWrapper(target, k)

        traverse(root, queueWrapper)

        val result = arrayListOf<Int>()

        queueWrapper.queue.forEach { it ->
            result.add(it.second)
        }

        return result
    }

    private fun traverse(node: TreeNode, queueWrapper: QueueWrapper) {
        queueWrapper.offer(node.`val`)
        node.left?.let { traverse(it, queueWrapper) }
        node.right?.let { traverse(it, queueWrapper) }
    }
}
