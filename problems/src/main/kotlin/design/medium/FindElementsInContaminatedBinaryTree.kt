package design.medium

import data_structures.TreeNode

/**
 * Given a binary tree with the following rules:
 * * root.val == 0
 * * For any treeNode:
 * * * If treeNode.val has a value x and treeNode.left != null, then treeNode.left.val == 2 * x + 1
 * * * If treeNode.val has a value x and treeNode.right != null, then treeNode.right.val == 2 * x + 2
 * Now the binary tree is contaminated, which means all treeNode.val have been changed to -1.
 *
 * Implement the FindElements class:
 * * FindElements(TreeNode* root) Initializes the object with a contaminated binary tree and recovers it.
 * * bool find(int target) Returns true if the target value exists in the recovered binary tree.
 *
 * [URL](https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/)
 */
class FindElements(val root: TreeNode?) {
    val set = HashSet<Int>()
    init {
        restoreTree(root)
    }

    private fun restoreTree(root: TreeNode?) {
        if (root == null) return
        root.`val` = 0
        set.add(0)
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            curr.left?.let {
                it.`val` = curr.`val` * 2 + 1
                set.add(it.`val`)
                queue.offer(it)
            }
            curr.right?.let {
                it.`val` = curr.`val` * 2 + 2
                set.add(it.`val`)
                queue.offer(it)
            }
        }

    }

    fun find(target: Int): Boolean {
        return target in set
    }

}