package trees.easy

import data_structures.TreeNode


/**
 * Given the root of a binary search tree (BST) with duplicates, return all the mode(s)
 * (i.e., the most frequently occurred element) in it.
 *
 * If the tree has more than one mode, return them in any order.
 *
 * Assume a BST is defined as follows:
 * * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * * Both the left and right subtrees must also be binary search trees.
 *
 * [URL](https://leetcode.com/problems/find-mode-in-binary-search-tree/)
 */
object FindModeInBinarySearchTree {
    private var maxStreak = 0
    private var currStreak = 0
    private var currNum = 0
    private var result = ArrayList<Int>()

    fun findModeMorrisInorder(root: TreeNode?): IntArray {
        maxStreak = 0
        currStreak = 0
        currNum = 0
        result = ArrayList()
        var curr = root

        while (curr != null) {
            if (curr.left != null) {
                // find friend
                var friend = curr.left!!
                while (friend.right != null && friend.right != curr) {
                    friend = friend.right!!
                }

                if (friend.right == null) {
                    friend.right = curr
                    curr = curr.left
                } else {
                    friend.right = null
                    addNode(curr.`val`)
                    curr = curr.right
                }
            } else {
                addNode(curr.`val`)
                curr = curr.right
            }
        }
        return result.toIntArray()
    }

    private fun addNode(num: Int) {
        if (num == currNum) {
            currStreak++
        } else {
            currStreak = 1
            currNum = num
        }

        if (currStreak > maxStreak) {
            result = ArrayList()
            maxStreak = currStreak
        }
        if (currStreak == maxStreak) {
            result.add(num)
        }
    }
}
