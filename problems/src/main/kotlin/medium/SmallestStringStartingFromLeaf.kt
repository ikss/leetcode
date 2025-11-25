package medium

import data_structures.TreeNode

/**
 * You are given the root of a binary tree where each node has a value in the range [0, 25] representing the letters 'a' to 'z'.
 *
 * Return the lexicographically smallest string that starts at a leaf of this tree and ends at the root.
 *
 * As a reminder, any shorter prefix of a string is lexicographically smaller.
 *
 * For example, "ab" is lexicographically smaller than "aba".
 * A leaf of a node is a node that has no children.
 *
 * [URL](https://leetcode.com/problems/smallest-string-starting-from-leaf/)
 */
object SmallestStringStartingFromLeaf {

    fun smallestFromLeaf(root: TreeNode): String {
        var smallestString = ""
        val queue = java.util.ArrayDeque<Pair<TreeNode, String>>()

        queue.add(root to ('a' + root.`val`).toString())

        while (!queue.isEmpty()) {
            val (node, curr)= queue.poll()

            if (node.left == null && node.right == null) {
                smallestString = if (smallestString.isNotEmpty()) minOf(smallestString, curr) else curr
                continue
            }

            node.left?.let { queue.add(it to ('a' + it.`val`) + curr) }
            node.right?.let { queue.add(it to ('a' + it.`val`) + curr) }
        }

        return smallestString
    }
}
