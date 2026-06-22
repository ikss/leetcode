package medium

/**
 * A binary tree is given such that each node contains an additional random pointer
 * which could point to any node in the tree or null.
 *
 * Return a deep copy of the tree.
 *
 * The tree is represented in the same input/output way as normal binary trees
 * where each node is represented as a pair of `[val, random_index]` where:
 * * val: an integer representing Node.val
 * * random_index: the index of the node (in the input) where the random pointer points to,
 * or null if it does not point to any node.
 *
 * You will be given the tree in class Node and you should return the cloned tree in class NodeCopy.
 * NodeCopy class is just a clone of Node class with the same attributes and constructors.
 *
 * [URL](https://leetcode.com/problems/clone-binary-tree-with-random-pointer/)
 */
object CloneBinaryTreeWithRandomPointer {
    data class Node(var `val`: Int) {
        var left: Node? = null
        var right: Node? = null
        var random: Node? = null
    }
    data class NodeCopy(var `val`: Int) {
        var left: NodeCopy? = null
        var right: NodeCopy? = null
        var random: NodeCopy? = null
    }

    private var iter = 0
    fun copyRandomBinaryTree(root: Node?): NodeCopy? {
        val nodeMap = HashMap<Int, NodeCopy>()

        return copy(root, nodeMap)
    }

    private fun copy(node: Node?, nodeMap: HashMap<Int, NodeCopy>): NodeCopy? {
        if (node == null) return null

        val existing = nodeMap[node.`val`]

        if (existing != null) return existing

        val copied = NodeCopy(node.`val`)
        nodeMap[copied.`val`] = copied
        println("${iter++}: " + copied.`val`)
        copied.left = copy(node.left, nodeMap)
        copied.right = copy(node.right, nodeMap)
        copied.random = copy(node.random, nodeMap)

        return copied
    }
}
