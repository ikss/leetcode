package easy

import data_structures.UnionFind

/**
 * Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list,
 * instead you will be given access to the node to be deleted directly.
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 *
 * [URL](https://leetcode.com/problems/linked-list-cycle/)
 */
object FindIfPathExistsInGraph {
    fun validPathUnionFind(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        val uf = UnionFind(n)
        for (edge in edges) {
            uf.union(edge[0], edge[1])
        }
        return uf.find(source) == uf.find(destination)
    }
}
