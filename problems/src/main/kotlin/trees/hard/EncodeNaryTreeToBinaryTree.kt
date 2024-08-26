package trees.hard

import data_structures.NaryTreeNode
import data_structures.TreeNode
import java.util.*
import kotlin.collections.ArrayList


/**
 * Design an algorithm to encode an N-ary tree into a binary tree and decode the binary tree to get the original
 * N-ary tree. An N-ary tree is a rooted tree in which each node has no more than N children. Similarly, a binary tree
 * is a rooted tree in which each node has no more than 2 children. There is no restriction on how your encode/decode
 * algorithm should work. You just need to ensure that an N-ary tree can be encoded to a binary tree and this binary
 * tree can be decoded to the original N-nary tree structure.
 *
 * Nary-Tree input serialization is represented in their level order traversal,
 * each group of children is separated by the null value
 *
 * [URL](https://leetcode.com/problems/encode-n-ary-tree-to-binary-tree/)
 */
object EncodeNaryTreeToBinaryTree {
    fun encode(root: NaryTreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val newRoot = TreeNode(root.`val`)

        // Encode the first child of n-ary node to the left node of binary tree.
        if (root.children.isNotEmpty()) {
            val firstChild = root.children.get(0)
            val left = encode(firstChild)!!
            newRoot.left = left

            // Encoding the rest of the sibling nodes.
            var sibling: TreeNode = left
            for (i in 1 until root.children.size) {
                val right = encode(root.children[i])!!
                sibling.right = right
                sibling = right
            }
        }

        return newRoot
    }

    // Decodes your binary tree to an n-ary tree.
    fun decode(root: TreeNode?): NaryTreeNode? {
        if (root == null) {
            return null
        }

        val newRoot = NaryTreeNode(root.`val`, ArrayList())

        // Decoding all the children nodes
        var sibling = root.left
        while (sibling != null) {
            (newRoot.children as ArrayList).add(decode(sibling))
            sibling = sibling.right
        }

        return newRoot
    }
}
