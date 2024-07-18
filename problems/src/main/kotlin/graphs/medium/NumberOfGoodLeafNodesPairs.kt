package graphs.medium

import data_structures.TreeNode
import java.util.*

/**
 * You are given the root of a binary tree and an integer distance. A pair of two different leaf nodes of a binary tree
 * is said to be good if the length of the shortest path between them is less than or equal to distance.
 *
 * Return the number of good leaf node pairs in the tree.
 *
 * [URL](https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/)
 */
object NumberOfGoodLeafNodesPairs {
    fun countPairs(root: TreeNode?, distance: Int): Int {
        if (root == null || distance == 0) {
            return 0
        }
        val graph = HashMap<TreeNode, ArrayList<TreeNode>>()
        val leafNodes = HashSet<TreeNode>()

        traverseTree(root, graph, leafNodes)

        var result = 0

        for (leaf in leafNodes) {
            val bfsQueue = LinkedList<TreeNode>()
            val seen = HashSet<TreeNode>()
            bfsQueue.add(leaf)
            seen.add(leaf)
            // Go through all nodes that are within the given distance of
            // the current leaf node
            for (i in 0..distance) {
                // Clear all nodes in the queue (distance i away from leaf node)
                // Add the nodes' neighbors (distance i+1 away from leaf node)
                val size = bfsQueue.size
                for (j in 0 until size) {
                    // If current node is a new leaf node, add the found pair to our count
                    val currNode = bfsQueue.remove()
                    if (leafNodes.contains(currNode) && currNode !== leaf) {
                        result++
                    }
                    for (neighbor in graph[currNode] ?: continue) {
                        if (seen.add(neighbor)) {
                            bfsQueue.add(neighbor)
                        }
                    }
                }
            }
        }
        return result / 2
    }

    private fun traverseTree(
        node: TreeNode,
        graph: HashMap<TreeNode, ArrayList<TreeNode>>,
        leafNodes: HashSet<TreeNode>,
    ) {
        if (node.left == null && node.right == null) {
            leafNodes.add(node)
        }
        node.left?.let {
            graph.computeIfAbsent(node) { ArrayList() }.add(it)
            graph.computeIfAbsent(it) { ArrayList() }.add(node)
            traverseTree(it, graph, leafNodes)
        }
        node.right?.let {
            graph.computeIfAbsent(node) { ArrayList() }.add(it)
            graph.computeIfAbsent(it) { ArrayList() }.add(node)
            traverseTree(it, graph, leafNodes)
        }
    }
}
