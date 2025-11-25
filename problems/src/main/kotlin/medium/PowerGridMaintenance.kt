package medium

import java.util.*

/**
 * You are given an integer c representing c power stations, each with a unique identifier id from 1 to c (1‑based indexing).
 *
 * These stations are interconnected via n bidirectional cables, represented by a 2D array connections,
 * where each element `connections[i] = [ui, vi]` indicates a connection between station ui and station vi.
 * Stations that are directly or indirectly connected form a power grid.
 *
 * Initially, all stations are online (operational).
 *
 * You are also given a 2D array queries, where each query is one of the following two types:
 *
 * * `[1, x]`: A maintenance check is requested for station x. If station x is online, it resolves the check by itself.
 * If station x is offline, the check is resolved by the operational station with the smallest id in the same power
 * grid as x. If no operational station exists in that grid, return -1.
 *
 * * `[2, x]`: Station x goes offline (i.e., it becomes non-operational).
 *
 * Return an array of integers representing the results of each query of type [1, x] in the order they appear.
 *
 * Note: The power grid preserves its structure; an offline (non‑operational) node remains part of its grid and taking
 * it offline does not alter connectivity.
 *
 * [URL](https://leetcode.com/problems/alternating-groups-ii/)
 */
object PowerGridMaintenance {
    private class UnionFind(val maxStations: Int) {
        private val ranks = IntArray(maxStations) { 1 }
        private val parents = IntArray(maxStations) { it }
        private val connectedGrids = Array(maxStations) { n -> TreeSet<Int>().also { it.add(n) } }
        private val offline = HashSet<Int>()

        fun union(s1: Int, s2: Int) {
            val p1 = find(s1)
            val p2 = find(s2)
            if (p1 == p2) return

            val (newPar, newChild) = if (ranks[p1] >= ranks[p2]) p1 to p2 else p2 to p1

            ranks[newPar] += ranks[newChild]
            ranks[newChild] = 0
            parents[newChild] = newPar
            connectedGrids[newPar].addAll(connectedGrids[newChild])
            connectedGrids[newChild] = TreeSet<Int>()
        }

        fun find(s: Int): Int {
            var curr = s

            while (parents[curr] != curr) {
                curr = parents[curr]
            }

            val parent = curr
            curr = s
            while (parents[curr] != curr) {
                curr = parents[curr]
                parents[curr] = parent
            }

            return curr
        }

        fun getMinFor(s: Int): Int {
            if (s !in offline) {
                return s
            }
            val parent = find(s)
            val grid = connectedGrids[parent]
            if (grid.isEmpty()) {
                return -1
            }
            var temp = grid.first()

            while (temp in offline) {
                grid.remove(temp)
                if (grid.isEmpty()) {
                    temp = -1
                    break
                }
                temp = grid.first()
            }
            return temp
        }

        fun markOffline(s: Int) {
            offline.add(s)
        }
    }

    fun processQueries(c: Int, connections: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val uf = UnionFind(c + 1)

        for ((first, second) in connections) {
            uf.union(first, second)
        }

        val result = ArrayList<Int>()

        for ((command, station) in queries) {
            if (command == 1) {
                result.add(uf.getMinFor(station))
            } else if (command == 2) {
                uf.markOffline(station)
            }
        }

        return result.toIntArray()
    }
}
