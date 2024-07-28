package graphs.hard

import java.util.*

/**
 * A city is represented as a bi-directional connected graph with n vertices where each vertex is labeled from 1 to n (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself. The time taken to traverse any edge is time minutes.
 *
 * Each vertex has a traffic signal which changes its color from green to red and vice versa every change minutes.
 * All signals change at the same time. You can enter a vertex at any time, but can leave a vertex only when the signal
 * is green. You cannot wait at a vertex if the signal is green.
 *
 * The second minimum value is defined as the smallest value strictly larger than the minimum value.
 * * For example the second minimum value of [2, 3, 4] is 3, and the second minimum value of [2, 2, 4] is 4.
 *
 * Given n, edges, time, and change, return the second minimum time it will take to go from vertex 1 to vertex n.
 *
 * Notes:
 * * You can go through any vertex any number of times, including 1 and n.
 * * You can assume that when the journey starts, all signals have just turned green.
 *
 * [URL](https://leetcode.com/problems/second-minimum-time-to-reach-destination/)
 */
object SecondMinimumTimeToReachDestination {
    fun secondMinimum(n: Int, edges: Array<IntArray>, time: Int, change: Int): Int {
        val graph = HashMap<Int, ArrayList<Int>>()

        for ((start, end) in edges) {
            graph.computeIfAbsent(start) { ArrayList() }.add(end)
            graph.computeIfAbsent(end) { ArrayList() }.add(start)
        }

        val dist1 = IntArray(n + 1) { Int.MAX_VALUE }
        val dist2 = IntArray(n + 1) { Int.MAX_VALUE }
        val freq = IntArray(n + 1)

        val queue = PriorityQueue<Pair<Int, Int>> { p1, p2 -> p1.second - p2.second }
        queue.offer(1 to 0)
        dist1[1] = 0

        while (queue.isNotEmpty()) {
            val (curr, currTime) = queue.poll()
            freq[curr]++
            if (freq[curr] == 2 && curr == n) {
                return currTime
            }

            val nextTime = getNextTime(currTime, time, change)
            for (neigh in graph[curr] ?: continue) {
                if (freq[neigh] >= 2) {
                    continue
                }
                
                if (dist1[neigh] > nextTime) {
                    dist2[neigh] = dist1[neigh]
                    dist1[neigh] = nextTime
                    queue.offer(neigh to nextTime)
                } else if (dist2[neigh] > nextTime && dist1[neigh] != nextTime) {
                    dist2[neigh] = nextTime
                    queue.offer(neigh to nextTime)
                }
            }
        }

        return -1
    }

    private fun getNextTime(currTime: Int, time: Int, change: Int): Int {
        return time + if ((currTime / change) % 2 != 0) {
            currTime + change - currTime % change
        } else {
            currTime
        }
    }
}
