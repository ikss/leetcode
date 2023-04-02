package trees.easy

import data_structures.TreeNode
import java.util.*

/**
 * Given the root node of a binary search tree and two integers low and high,
 * return the sum of values of all nodes with a value in the inclusive range `[low, high]`.
 *
 * [URL](https://leetcode.com/problems/range-sum-of-bst/)
 */
object RangeSumOfBST {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        var res = 0
        val stack = Stack<TreeNode?>()
        stack.push(root)
        while (!stack.isEmpty()) {
            val node = stack.pop()
                ?: continue
            val value = node.`val`
            if (value in low..high) {
                res += value
            }
            if (low < value) {
                stack.push(node.left)
            }
            if (value < high) {
                stack.push(node.right)
            }
        }
        return res
    }
}
