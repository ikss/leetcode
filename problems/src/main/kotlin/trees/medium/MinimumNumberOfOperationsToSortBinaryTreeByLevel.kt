package trees.medium

import data_structures.TreeNode
import java.util.*


/**
 * You are given the root of a binary tree with unique values.
 *
 * In one operation, you can choose any two nodes at the same level and swap their values.
 *
 * Return the minimum number of operations needed to make the values at each level sorted in a strictly increasing order.
 *
 * The level of a node is the number of edges along the path between it and the root node.
 *
 * [URL](https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/)
 */
object MinimumNumberOfOperationsToSortBinaryTreeByLevel {
    fun minimumOperations(root: TreeNode?): Int {
        if (root == null) return 0

        var level = ArrayList<TreeNode>()
        level.add(root)

        var result = 0
        while (level.isNotEmpty()) {
            val newLevel = ArrayList<TreeNode>()
            for (node in level) {
                node.left?.let(newLevel::add)
                node.right?.let(newLevel::add)
            }

            result += getMinSwaps(level.mapTo(ArrayList(level.size)) { it.`val` })
            level = newLevel
        }
        return result
    }
    private fun getMinSwaps(original: ArrayList<Int>): Int {
        var swaps = 0

        val sorted = original.sorted()

        val pos = HashMap<Int, Int>()
        for (i in original.indices) {
            pos[original[i]] = i
        }

        for (i in original.indices) {
            if (original[i] != sorted[i]) {
                swaps++

                val curPos = pos[sorted[i]]!!
                pos[original[i]] = curPos
                original[curPos] = original[i]
            }
        }
        return swaps
    }
}