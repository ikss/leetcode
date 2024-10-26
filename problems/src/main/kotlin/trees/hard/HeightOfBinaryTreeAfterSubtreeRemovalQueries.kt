package trees.hard

import data_structures.TreeNode
import java.util.*

/**
 * You are given the root of a binary tree with n nodes. Each node is assigned a unique value from 1 to n.
 * You are also given an array queries of size m.
 *
 * You have to perform m independent queries on the tree where in the ith query you do the following:
 * * Remove the subtree rooted at the node with the value `queries[i]` from the tree. It is guaranteed that `queries[i]`
 * will not be equal to the value of the root.
 * Return an array answer of size m where `answer[i]` is the height of the tree after performing the ith query.
 *
 * Note:
 * * The queries are independent, so the tree returns to its initial state after each query.
 * * The height of a tree is the number of edges in the longest simple path from the root to some node in the tree.
 *
 * [URL](https://leetcode.com/problems/height-of-binary-tree-after-subtree-removal-queries/)
 */
object HeightOfBinaryTreeAfterSubtreeRemovalQueries {
    fun treeQueries(root: TreeNode?, queries: IntArray): IntArray {
        if (root == null) return intArrayOf()
        val excluded = queries.withIndex().groupBy({ it.value }, { it.index })

        val result = IntArray(queries.size)
        calculateTreeHeight(root, excluded, HashSet(), result, 0)

        return result
    }

    private fun calculateTreeHeight(
        node: TreeNode?,
        excluded: Map<Int, List<Int>>,
        dontCount: HashSet<Int>,
        result: IntArray,
        curr: Int,
    ) {
        if (node == null) return

        excluded[node.`val`]?.let {
            dontCount.addAll(it)
            for (i in it) {
                result[i] = maxOf(result[i], curr - 1)
            }
        }
        calculateTreeHeight(node.left, excluded, dontCount, result, curr + 1)
        calculateTreeHeight(node.right, excluded, dontCount, result, curr + 1)
        if (node.left == null && node.right == null) {
            for (i in result.indices) {
                if (i in dontCount) continue
                result[i] = maxOf(result[i], curr)
            }
        }

        excluded[node.`val`]?.let {
            dontCount.removeAll(it)
        }
    }
}
