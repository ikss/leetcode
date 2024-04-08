package trees.medium

import java.util.*

/**
 * Given an array of unique integers preorder, return true if it is the correct
 * preorder traversal sequence of a binary search tree.
 *
 * [URL](https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/)
 */
object VerifyPreorderSequenceInBinarySearchTree {
    fun verifyPreorder(preorder: IntArray): Boolean {
        var min = Integer.MIN_VALUE
        val stack = Stack<Int>()

        for (n in preorder) {
            while (stack.isNotEmpty() && stack.peek() < n) {
                min = stack.pop()
            }

            if (n <= min) {
                return false
            }

            stack.push(n)
        }
        return true
    }
}
