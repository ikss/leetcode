package medium

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, replace the value of each node in the tree with the sum of all its cousins' values.
 *
 * Two nodes of a binary tree are cousins if they have the same depth with different parents.
 *
 * Return the root of the modified tree.
 *
 * Note that the depth of a node is the number of edges in the path from the root node to it.
 *
 * [URL](https://leetcode.com/problems/cousins-in-binary-tree-ii/)
 */
object CousinsInBinaryTreeII {
    fun replaceValueInTree(root: TreeNode?): TreeNode? {
        if (root == null) return null

        val queue = ArrayDeque<Pair<TreeNode, TreeNode>>()
        queue.offer(root to root)

        val sumByRoot = IdentityHashMap<TreeNode, Int>()
        while (queue.isNotEmpty()) {
            val size = queue.size
            var cousins = 0
            for ((el, _) in queue) {
                cousins += el.`val`
            }
            for (i in 0 until size) {
                val (el, parent) = queue.poll()
                el.left?.let {
                    sumByRoot.merge(el, it.`val`, Int::plus)
                    queue.offer(it to el)
                }
                el.right?.let {
                    sumByRoot.merge(el, it.`val`, Int::plus)
                    queue.offer(it to el)
                }
                el.`val` = cousins - sumByRoot.getOrDefault(parent, 0)
                if (el === root) el.`val` = 0
            }
        }

        return root
    }
}
