package trees.medium

import data_structures.TreeNode
import java.util.*
import kotlin.collections.set

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 *
 * According to the definition of LCA on Wikipedia:
 * “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as
 * descendants (where we allow a node to be a descendant of itself).”
 *
 * [URL](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)
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

    private var res: TreeNode? = null

    fun lowestCommonAncestorRecursive(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        res = null
        recurseTree(root, p, q)
        return res
    }

    private fun recurseTree(curr: TreeNode?, p: TreeNode?, q: TreeNode?): Boolean {
        if (curr == null) return false

        val left = if (recurseTree(curr.left, p, q)) 1 else 0
        val right = if (recurseTree(curr.right, p, q)) 1 else 0

        val mid = if (curr == p || curr == q) 1 else 0

        if (left + right + mid >= 2) {
            res = curr
        }
        return (left + right + mid > 0)
    }
}
