package design.medium

import data_structures.TreeNode
import java.util.LinkedList

/**
 * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST
 * is changed to the original key plus the sum of all keys greater than the original key in BST.
 *
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 * * The left subtree of a node contains only nodes with keys less than the node's key.
 * * The right subtree of a node contains only nodes with keys greater than the node's key.
 * * Both the left and right subtrees must also be binary search trees.
 *
 * [URL](https://leetcode.com/problems/serialize-and-deserialize-bst/)
 */
object SerializeAndDeserializeBST {
    class Codec() {
        // Encodes a tree to a single string.
        fun serialize(root: TreeNode?): String {
            val nodes = ArrayList<Int?>()

            val nodeQueue = LinkedList<TreeNode?>()
            nodeQueue.offer(root)

            while (nodeQueue.isNotEmpty()) {
                val curr = nodeQueue.poll()
                if (curr == null) {
                    nodes.add(null)
                    continue
                }
                nodes.add(curr.`val`)
                nodeQueue.offer(curr.left)
                nodeQueue.offer(curr.right)
            }

            return nodes.joinToString(",")
        }

        // Decodes your encoded data to tree.
        fun deserialize(data: String): TreeNode? {
            val nodes = data.split(',').map { if (it == "null") null else it.toInt() }

            if (nodes[0] == null) {
                return null
            }

            val head = TreeNode(nodes[0]!!)
            val nodeQueue = java.util.ArrayDeque<TreeNode>()
            nodeQueue.offer(head)

            for (i in 1 until nodes.size step 2) {
                val curr = nodeQueue.poll() ?: break

                curr.left = nodes[i]?.let {
                    val node = TreeNode(it)
                    nodeQueue.offer(node)
                    node
                }
                if (i < nodes.size - 1) {
                    curr.right = nodes[i + 1]?.let {
                        val node = TreeNode(it)
                        nodeQueue.offer(node)
                        node
                    }
                }
            }


            return head
        }
    }
}