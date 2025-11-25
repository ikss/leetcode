package medium

import data_structures.TreeNode

/**
 * Given a binary tree where node values are digits from 1 to 9.
 * A path in the binary tree is said to be _pseudo-palindromic_ if at least one permutation of the node values
 * in the path is a palindrome.
 *
 * Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
 *
 * [URL](https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/)
 */
object PseudoPalindromicPathsInBinaryTree {
    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        if (root == null) return 0
        val arr = IntArray(10)
        arr[root.`val`]++
        return countPseudoPalindromic(root, arr)
    }

    private fun countPseudoPalindromic(node: TreeNode, frequencies: IntArray): Int {
        if (node.left == null && node.right == null) {
            var hasOdd = false
            for (fr in frequencies) {
                val isOdd = fr % 2 != 0
                if (isOdd) {
                    if (hasOdd) return 0
                    hasOdd = true
                }
            }
            return 1
        }
        var result = 0
        node.left?.let { left ->
            frequencies[left.`val`]++
            result += countPseudoPalindromic(left, frequencies)
            frequencies[left.`val`]--
        }
        node.right?.let { right ->
            frequencies[right.`val`]++
            result += countPseudoPalindromic(right, frequencies)
            frequencies[right.`val`]--
        }

        return result
    }
}