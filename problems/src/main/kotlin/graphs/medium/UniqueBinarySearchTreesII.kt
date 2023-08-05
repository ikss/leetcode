package graphs.medium

import data_structures.TreeNode


/**
 * Given an integer n, return all the structurally unique BST's (binary search trees),
 * which has exactly n nodes of unique values from 1 to n. Return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/unique-binary-search-trees-ii/)
 */
object UniqueBinarySearchTreesII {
    fun generateTreesRecursive(n: Int): List<TreeNode?> {
        return generateTrees(1, n).toList()
    }

    private fun generateTrees(min: Int, max: Int): Sequence<TreeNode?> {
        if (min > max) {
            return sequenceOf(null)
        }
        return (min..max).asSequence()
            .flatMap { i ->
                generateTrees(min, i - 1).flatMap { left ->
                    generateTrees(i + 1, max).map { right ->
                        TreeNode(i, left, right)
                    }
                }
            }
    }

    fun generateTreesMemo(n: Int): List<TreeNode?> {
        val memo = HashMap<Pair<Int, Int>, List<TreeNode?>>()
        return allPossibleBST(1, n, memo)
    }

    private fun allPossibleBST(start: Int, end: Int, memo: HashMap<Pair<Int, Int>, List<TreeNode?>>): List<TreeNode?> {
        val res = ArrayList<TreeNode?>()
        if (start > end) {
            res.add(null)
            return res
        }
        memo[start to end]?.let { return it }
        // Iterate through all values from start to end to construct left and right subtree recursively.
        for (i in start..end) {
            val leftSubTrees = allPossibleBST(start, i - 1, memo)
            val rightSubTrees = allPossibleBST(i + 1, end, memo)

            // Loop through all left and right subtrees and connect them to ith root.
            for (left in leftSubTrees) {
                for (right in rightSubTrees) {
                    val root = TreeNode(i, left, right)
                    res.add(root)
                }
            }
        }
        memo[start to end] = res
        return res
    }
}
