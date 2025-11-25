package medium

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
 * (i.e., from left to right, then right to left for the next level and alternate between).
 *
 * [URL](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
 */
object BinaryTreeZigzagLevelOrderTraversal {
    fun zigzagLevelOrderNaive(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()

        val result = arrayListOf<ArrayList<Int>>()
        var stack = Stack<TreeNode>()
        stack.push(root)
        var reversed = true

        while (stack.isNotEmpty()) {
            val newStack = Stack<TreeNode>()
            val level = arrayListOf<Int>()
            val size = stack.size

            for (i in 0 until size) {
                val node = stack.pop()
                level.add(node.`val`)
                if (reversed) {
                    node.left?.let { newStack.push(it) }
                    node.right?.let { newStack.push(it) }
                } else {
                    node.right?.let { newStack.push(it) }
                    node.left?.let { newStack.push(it) }
                }
            }
            reversed = !reversed
            result.add(level)
            stack = newStack
        }

        return result
    }

    fun zigzagLevelOrderDfs(root: TreeNode?): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()
        dfs(root, 0, ans)
        return ans
    }

    fun dfs(curr: TreeNode?, index: Int, ans: MutableList<MutableList<Int>>) {
        if (curr != null) {
            val row = ans.getOrElse(index) { mutableListOf<Int>().also { ans.add(it) } }
            if (index % 2 == 0) row.add(curr.`val`)
            else row.add(0, curr.`val`)

            dfs(curr.left, index + 1, ans)
            dfs(curr.right, index + 1, ans)
        }
    }
}