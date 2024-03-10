package arrays.medium

import data_structures.TreeNode

/**
 * Given a binary tree where node values are digits from 1 to 9. A path in the binary tree is said to be
 * pseudo-palindromic if at least one permutation of the node values in the path is a palindrome.
 *
 * Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
 *
 * [URL](https://leetcode.com/problems/asteroid-collision/)
 */
object PseudoPalindromicPathsInBinaryTree {
    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        if (root == null) return 0
        return countPalindromic(root, IntArray(10))
    }

    private fun countPalindromic(node: TreeNode, counts: IntArray): Int {
        counts[node.`val`]++
        var result = 0
        if (node.left == null && node.right == null) {
            if (isPalindromic(counts)) result++
        } else {
            val left = node.left?.let { countPalindromic(it, counts) } ?: 0
            val right = node.right?.let { countPalindromic(it, counts) } ?: 0
            result += left + right
        }
        counts[node.`val`]--
        return result
    }

    private fun isPalindromic(counts: IntArray): Boolean {
        var hasNonEven = false

        for (c in counts) {
            if (c % 2 != 0) {
                if (hasNonEven) return false
                hasNonEven = true
            }
        }
        return true
    }
}