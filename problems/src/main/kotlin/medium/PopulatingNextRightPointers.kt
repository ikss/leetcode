package medium

import data_structures.TreeLinkNode

/**
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children.
 * The binary tree has the following definition:
 *
 * struct Node {
 *     int val;
 *     Node *left;
 *     Node *right;
 *     Node *next;
 * }
 *
 * Populate each next pointer to point to its next right node. If there is no next right node,
 * the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 * [URL](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)
 */
object PopulatingNextRightPointers {

    fun connect(root: TreeLinkNode?) {
        var levelStart = root
        while (levelStart != null) {
            var cur = levelStart
            while (cur != null) {
                if (cur.left != null) {
                    cur.left!!.next = cur.right
                }
                if (cur.right != null && cur.next != null) {
                    cur.right!!.next = cur.next!!.left
                }
                cur = cur.next
            }
            levelStart = levelStart.left
        }
    }
}
