package medium

import data_structures.UnionFind
import java.util.*

/**
 * There are n computers numbered from 0 to n - 1 connected by ethernet cables connections forming a network
 * where `connections[i] = [ai, bi]` represents a connection between computers ai and bi.
 * Any computer can reach any other computer directly or indirectly through the network.
 *
 * You are given an initial computer network connections. You can extract certain cables between two directly
 * connected computers, and place them between any pair of disconnected computers to make them directly connected.
 *
 * Return the minimum number of times you need to do this in order to make all the computers connected.
 * If it is not possible, return -1.
 *
 * [URL](https://leetcode.com/problems/number-of-operations-to-make-network-connected/)
 */
object NumberOfOperationsToMakeNetworkConnected {

    fun makeConnectedDfs(n: Int, connections: Array<IntArray>): Int {
        if (connections.size < n - 1) {
            return -1
        }
        val adj = HashMap<Int, MutableList<Int>>()
        for ((s, e) in connections) {
            adj.computeIfAbsent(s) { ArrayList() }.add(e)
            adj.computeIfAbsent(e) { ArrayList() }.add(s)
        }
        var numberOfConnectedComponents = 0
        val visit = BooleanArray(n)
        for (i in 0 until n) {
            if (!visit[i]) {
                numberOfConnectedComponents++
                bfs(i, adj, visit)
            }
        }
        return numberOfConnectedComponents - 1
    }

    private fun bfs(start: Int, adj: Map<Int, List<Int>>, visit: BooleanArray) {
        val q = ArrayDeque<Int>()
        q.offer(start)
        visit[start] = true
        while (!q.isEmpty()) {
            val neighbors = adj[q.poll()]
                ?: continue
            for (neighbor in neighbors) {
                if (!visit[neighbor]) {
                    visit[neighbor] = true
                    q.offer(neighbor)
                }
            }
        }
    }

    fun makeConnectedUnionFind(n: Int, connections: Array<IntArray>): Int {
        if (connections.size < n - 1) {
            return -1
        }
        val find = UnionFind(n)
        var numberOfConnectedComponents = n

        for ((s, e) in connections) {
            if (find.find(s) != find.find(e)) {
                numberOfConnectedComponents--
                find.union(s, e)
            }
        }

        return numberOfConnectedComponents - 1
    }

}
