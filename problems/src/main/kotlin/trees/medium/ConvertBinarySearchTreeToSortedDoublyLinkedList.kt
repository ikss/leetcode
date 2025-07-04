package trees.medium

import data_structures.TreeNode

/**
 * Convert a Binary Search Tree to a sorted Circular Doubly-Linked List in place.
 *
 * You can think of the left and right pointers as synonymous to the predecessor and successor pointers
 * in a doubly-linked list. For a circular doubly linked list, the predecessor of the first element is the last element,
 * and the successor of the last element is the first element.
 *
 * We want to do the transformation in place. After the transformation, the left pointer of the tree node should point
 * to its predecessor, and the right pointer should point to its successor. You should return the pointer to the
 * smallest element of the linked list.
 *
 * [URL](https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/)
 *
 * **NOTE** without tests, cause tail is linked to head
 */
object ConvertBinarySearchTreeToSortedDoublyLinkedList {
    var first: TreeNode? = null
    var last: TreeNode? = null

    fun treeToDoublyList(root: TreeNode?): TreeNode? {
        first = null
        last = null
        if (root == null) return null

        helper(root)

        // close DLL
        last!!.right = first
        first!!.left = last
        return first
    }

    fun helper(node: TreeNode?) {
        if (node != null) {
            // left
            helper(node.left)

            // node
            if (last != null) {
                // link the previous node (last)
                // with the current one (node)
                last!!.right = node
                node.left = last
            } else {
                // keep the smallest node
                // to close DLL later on
                first = node
            }
            last = node

            // right
            helper(node.right)
        }
    }
}
