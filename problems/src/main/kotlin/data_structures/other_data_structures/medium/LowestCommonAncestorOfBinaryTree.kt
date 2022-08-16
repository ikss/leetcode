package data_structures.other_data_structures.medium

import data_structures.TreeNode
import java.util.*
import kotlin.collections.set


/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 *
 * [URL](https://leetcode.com/problems/binary-tree-level-order-traversal/)
 */
object LowestCommonAncestorOfBinaryTree {

    fun lowestCommonAncestorIterative(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) return null
        // Stack for tree traversal
        var first = p
        var second = q
        val stack = ArrayDeque<TreeNode>()

        // HashMap for parent pointers
        val parent = mutableMapOf<TreeNode?, TreeNode?>()
        parent[root] = null
        stack.push(root)

        // Iterate until we find both the nodes p and q
        while (!parent.containsKey(first) || !parent.containsKey(second)) {
            val node = stack.pop()

            // While traversing the tree, keep saving the parent pointers.
            if (node.left != null) {
                parent[node.left] = node
                stack.push(node.left!!)
            }
            if (node.right != null) {
                parent[node.right] = node
                stack.push(node.right!!)
            }
        }

        // Ancestors set() for node p.
        val ancestors: MutableSet<TreeNode?> = HashSet()

        // Process all ancestors for node p using parent pointers.
        while (first != null) {
            ancestors.add(first)
            first = parent[first]
        }

        // The first ancestor of q which appears in
        // p's ancestor set() is their lowest common ancestor.
        while (!ancestors.contains(second)) {
            second = parent[second]
        }
        return second
    }

    private var ans: TreeNode? = null

    fun lowestCommonAncestorRecursive(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        ans = null
        recurseTree(root, p, q)
        return ans
    }

    private fun recurseTree(curr: TreeNode?, p: TreeNode?, q: TreeNode?): Boolean {
        if (curr == null) return false

        val left = if (recurseTree(curr.left, p, q)) 1 else 0
        val right = if (recurseTree(curr.right, p, q)) 1 else 0

        val mid = if (curr == p || curr == q) 1 else 0

        if (left + right + mid >= 2) {
            ans = curr
        }
        return (left + right + mid > 0)
    }
}
