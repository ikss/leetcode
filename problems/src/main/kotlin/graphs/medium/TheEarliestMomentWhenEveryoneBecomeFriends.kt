package graphs.medium

import data_structures.GraphNode

/**
 * There are n people in a social group labeled from 0 to n - 1. You are given an array logs where
 * `logs[i] = [timestampi, xi, yi]` indicates that xi and yi will be friends at the time timestampi.
 *
 * Friendship is symmetric. That means if a is friends with b, then b is friends with a. Also, person a is acquainted
 * with a person b if a is friends with b, or a is a friend of someone acquainted with b.
 *
 * Return the earliest time for which every person became acquainted with every other person.
 * If there is no such earliest time, return -1.
 *
 * [URL](https://leetcode.com/problems/the-earliest-moment-when-everyone-become-friends/)
 */
object TheEarliestMomentWhenEveryoneBecomeFriends {
    fun earliestAcq(logs: Array<IntArray>, n: Int): Int {
        logs.sortBy { it[0] }
        val uf = UnionFind(n)
        for ((t, x, y) in logs) {
            uf.union(x, y)
            if (uf.allConnected()) return t
        }
        return -1
    }

    private class UnionFind(n: Int) {
        private val root = IntArray(n + 1) { it }
        private val rank = IntArray(n + 1) { 1 }
        private var components = n


        fun find(x: Int): Int {
            if (x != root[x]) {
                root[x] = find(root[x])
            }
            return root[x]
        }

        fun union(x: Int, y: Int) {
            var rootx = find(x)
            var rooty = find(y)
            if (rootx == rooty) return

            if (rank[rootx] > rank[rooty]) {
                val tmp = rootx
                rootx = rooty
                rooty = tmp
            }

            components--
            root[rootx] = rooty
            rank[rooty] += rank[rootx]
        }

        fun allConnected(): Boolean = components == 1
    }
}
