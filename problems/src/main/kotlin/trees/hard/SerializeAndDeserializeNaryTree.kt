package trees.hard

import data_structures.NaryTreeNode
import data_structures.TreeNode
import java.util.*
import kotlin.collections.ArrayList

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be
 * stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the
 * same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize an N-ary tree. An N-ary tree is a rooted tree in which each node
 * has no more than N children. There is no restriction on how your serialization/deserialization algorithm should work.
 * You just need to ensure that an N-ary tree can be serialized to a string and this string can be deserialized to the
 * original tree structure.
 *
 * [URL](https://leetcode.com/problems/serialize-and-deserialize-n-ary-tree/)
 */
object SerializeAndDeserializeNaryTree {
    // Encodes a tree to a single string.
    fun serialize(root: NaryTreeNode?): String {
        if (root == null) {
            return ""
        }

        val stringBuilder = StringBuilder()
        val nodes = LinkedList<NaryTreeNode?>()
        nodes.offer(root)
        nodes.offer(null)

        while (nodes.isNotEmpty()) {
            val size = nodes.size

            for (i in 0 until size) {
                val curr = nodes.poll()
                if (curr != null) {
                    if (stringBuilder.isNotEmpty()) {
                        stringBuilder.append(',')
                    }
                    stringBuilder.append(curr.`val`)
                    curr.children.forEach { child ->
                        child?.let(nodes::offer)
                    }
                    nodes.offer(null)
                } else {
                    stringBuilder.append(",null")
                }
            }
        }
    
        return stringBuilder.toString()
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): NaryTreeNode? {
        if (data.isEmpty()) return null
        val values = data.split(',').map { if (it == "null") null else it.toInt() }

        val rootVal = values.firstOrNull() ?: return null
        val root = NaryTreeNode(rootVal)
        var index = 2
        val queue = java.util.ArrayDeque<NaryTreeNode>()
        queue.offer(root)

        while (index < values.size && queue.isNotEmpty()) {
            val currNode = queue.poll()!!

            // add current level
            val currLevel = ArrayList<NaryTreeNode>()
            while (index < values.size && values[index] != null) {
                val childNode = NaryTreeNode(values[index++]!!)
                currLevel.add(childNode)
                queue.offer(childNode)
            }
            currNode.children = currLevel
            // skip null
            index++
        }
        return root
    }
}
