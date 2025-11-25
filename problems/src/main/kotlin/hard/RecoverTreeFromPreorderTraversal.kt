package hard

import data_structures.TreeNode
import java.util.*

/**
 * We run a preorder depth-first search (DFS) on the root of a binary tree.
 *
 * At each node in this traversal, we output D dashes (where D is the depth of this node),
 * then we output the value of this node.  If the depth of a node is D, the depth of its immediate child is D + 1.
 * The depth of the root node is 0.
 *
 * If a node has only one child, that child is guaranteed to be the left child.
 *
 * Given the output traversal of this traversal, recover the tree and return its root.
 *
 * [URL](https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/)
 */
object RecoverTreeFromPreorderTraversal {
    fun recoverFromPreorder(S: String): TreeNode {
        var level: Int
        var value: Int
        val stack = Stack<TreeNode>()
        var i = 0

        while (i < S.length) {
            level = 0
            while (S[i] == '-') {
                level++
                i++
            }
            value = 0
            while (i < S.length && S[i] != '-') {
                value = value * 10 + (S[i].code - '0'.code)
                i++
            }
            while (stack.size > level) {
                stack.pop()
            }
            val node = TreeNode(value)
            if (!stack.isEmpty()) {
                val last = stack.peek()
                if (last.left == null) {
                    last.left = node
                } else {
                    last.right = node
                }
            }
            stack.add(node)
        }
        while (stack.size > 1) {
            stack.pop()
        }
        return stack.pop()
    }
}
