package hard

import java.util.*

/**
 * You are given a tree rooted at node 0 that consists of n nodes numbered from 0 to n - 1. The tree is represented by
 * an array parent of size n, where `parent[i]` is the parent of node i. Since node 0 is the root, parent[0] == -1.
 *
 * You are also given a string s of length n, where `s[i]` is the character assigned to node i.
 *
 * We make the following changes on the tree one time simultaneously for all nodes x from 1 to n - 1:
 * * Find the closest node y to node x such that y is an ancestor of x, and `s[x] == s[y]`.
 * * If node y does not exist, do nothing.
 * * Otherwise, remove the edge between x and its current parent and make node y the new parent of x by adding an edge between them.
 * Return an array answer of size n where `answer[i]` is the size of the subtree rooted at node i in the final tree.
 *
 * [URL](https://leetcode.com/problems/find-subtree-sizes-after-changes/)
 */
object FindSubtreeSizesAfterChanges {
    private data class Node(
        val value: Int,
        var parent: Int,
        val sval: Char,
    ) {
        var rank: Int = 0
        var children: ArrayList<Int> = ArrayList()
    }

    fun findSubtreeSizes(parent: IntArray, s: String): IntArray {
        val n = parent.size
        val nodes = Array(n) { Node(it, parent[it], s[it]) }

        for (n in nodes) {
            if (n.parent != -1) {
                nodes[n.parent].children.add(n.value)
            }
        }

        val result = IntArray(n)
        collectRanks(nodes[0], nodes, HashMap<Char, Node>())

        for (n in nodes) {
            result[n.value] = n.rank
        }

        return result
    }

    private fun collectRanks(node: Node, nodes: Array<Node>, ancestors: HashMap<Char, Node>) {
        val rank = if (node.children.isEmpty()) {
            1
        } else {
            val prev = ancestors[node.sval]
            ancestors[node.sval] = node
            node.children.forEach { collectRanks(nodes[it], nodes, ancestors) }.also {
                if (prev == null) {
                    ancestors.remove(node.sval)
                } else {
                    ancestors[node.sval] = prev
                }
            }
            1
        }

        node.rank += rank
        val prev = ancestors[node.sval]

        if (prev != null) {
            prev.rank += node.rank
        } else if (node.parent != -1) {
            nodes[node.parent].rank += node.rank
        }
    }
}
