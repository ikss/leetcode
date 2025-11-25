package medium

import data_structures.UnionFind

/**
 * We want to split a group of n people (labeled from 1 to n) into two groups of any size.
 * Each person may dislike some other people, and they should not go into the same group.
 *
 * Given the integer n and the array dislikes where `dislikes[i] = [ai, bi]` indicates that the person labeled ai
 * does not like the person labeled bi, return true if it is possible to split everyone into two groups in this way.
 *
 * [URL](https://leetcode.com/problems/possible-bipartition/)
 */
object PossibleBipartition {
    fun possibleBipartition(n: Int, dislikes: Array<IntArray>): Boolean {
        val graph = mutableMapOf<Int, MutableList<Int>>()

        for ((self, dis) in dislikes) {
            graph.computeIfAbsent(self) { mutableListOf() }.add(dis)
            graph.computeIfAbsent(dis) { mutableListOf() }.add(self)
        }

        val unionFind = UnionFind(n + 1)

        for (i in 1..n) {
            val neighbours = graph[i]
                ?: continue
            for (neighbour in neighbours) {
                if (unionFind.find(i) == unionFind.find(neighbour)) {
                    return false
                }
                unionFind.union(neighbours[0], neighbour)
            }
        }
        return true
    }
}
