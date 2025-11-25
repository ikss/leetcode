package medium

import java.util.*

/**
 * You are in a city that consists of n intersections numbered from 0 to n - 1 with bi-directional roads between some
 * intersections. The inputs are generated such that you can reach any intersection from any other intersection and that
 * there is at most one road between any two intersections.
 *
 * You are given an integer n and a 2D integer array roads where `roads[i] = [ui, vi, timei]` means that there is a road
 * between intersections ui and vi that takes timei minutes to travel. You want to know in how many ways you can travel
 * from intersection 0 to intersection n - 1 in the shortest amount of time.
 *
 * Return the number of ways you can arrive at your destination in the shortest amount of time. Since the answer may be
 * large, return it modulo 109 + 7.
 *
 * [URL](http://leetcode.com/problems/number-of-ways-to-arrive-at-destination/)
 */
object NumberOfWaysToArriveAtDestination {

    fun countPaths(n: Int, roads: Array<IntArray>): Int {
        val mod = 1_000_000_007

        val graph = Array<ArrayList<Pair<Int, Int>>>(n) { ArrayList() }

        for ((start, end, time) in roads) {
            graph[start].add(end to time)
            graph[end].add(start to time)
        }

        val queue = PriorityQueue<Pair<Int, Long>> { p1, p2 -> p1.second.compareTo(p2.second) }

        val shortestTime = LongArray(n) { Long.MAX_VALUE }
        val pathCount = IntArray(n)

        shortestTime[0] = 0
        pathCount[0] = 1

        queue.offer(0 to 0)

        while (queue.isNotEmpty()) {
            val (curr, currTime) = queue.poll()

            if (currTime > shortestTime[curr]) {
                continue
            }

            for ((neigh, neighTime) in graph[curr]) {
                if (currTime + neighTime < shortestTime[neigh]) {
                    shortestTime[neigh] = currTime + neighTime
                    pathCount[neigh] = pathCount[curr]
                    queue.offer(neigh to shortestTime[neigh])
                } else if (currTime + neighTime == shortestTime[neigh]) {
                    pathCount[neigh] = (pathCount[neigh] + pathCount[curr]) % mod
                }
            }
        }

        return pathCount[n - 1]
    }
}
