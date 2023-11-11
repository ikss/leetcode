package graphs.hard

import java.util.*


/**
 * There is a directed weighted graph that consists of n nodes numbered from 0 to n - 1.
 * The edges of the graph are initially represented by the given array edges where `edges[i] = [fromi, toi, edgeCosti]`
 * meaning that there is an edge from fromi to toi with the cost edgeCosti.
 *
 * Implement the Graph class:
 * * `Graph(int n, int[][] edges)` initializes the object with n nodes and the given edges.
 * * `addEdge(int[] edge)` adds an edge to the list of edges where `edge = [from, to, edgeCost]`.
 * It is guaranteed that there is no edge between the two nodes before adding this one.
 * * int shortestPath(int node1, int node2) returns the minimum cost of a path from node1 to node2.
 * If no path exists, return -1. The cost of a path is the sum of the costs of the edges in the path.
 *
 * [URL](https://leetcode.com/problems/design-graph-with-shortest-path-calculator/)
 */
object DesignGraphWithShortestPathCalculator {
    class Graph(n: Int, edges: Array<IntArray>) {
        private val adjMatrix = Array(n) { IntArray(n) { 1_000_000_000 } }

        init {
            for (e in edges) {
                adjMatrix[e[0]][e[1]] = e[2]
            }
            for (i in 0 until n) {
                adjMatrix[i][i] = 0
            }
            for (i in 0 until n) {
                for (j in 0 until n) {
                    for (k in 0 until n) {
                        adjMatrix[j][k] = minOf(adjMatrix[j][k], adjMatrix[j][i] + adjMatrix[i][k])
                    }
                }
            }
        }

        fun addEdge(edge: IntArray) {
            val n = adjMatrix.size
            for (i in 0 until n) {
                for (j in 0 until n) {
                    adjMatrix[i][j] = minOf(adjMatrix[i][j], adjMatrix[i][edge[0]] + adjMatrix[edge[1]][j] + edge[2])
                }
            }
        }

        fun shortestPath(node1: Int, node2: Int): Int {
            return if (adjMatrix[node1][node2] == 1_000_000_000) -1 else adjMatrix[node1][node2]
        }
    }
}