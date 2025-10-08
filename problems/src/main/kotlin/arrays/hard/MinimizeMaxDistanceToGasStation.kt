package arrays.hard

import java.util.*

/**
 * You are given an integer array stations that represents the positions of the gas stations on the x-axis.
 * You are also given an integer k.
 *
 * You should add k new gas stations. You can add the stations anywhere on the x-axis, and not necessarily on an integer position.
 *
 * Let penalty() be the maximum distance between adjacent gas stations after adding the k new stations.
 *
 * Return the smallest possible value of penalty(). Answers within 10-6 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/best-meeting-point/)
 */
object MinimizeMaxDistanceToGasStation {
    fun minmaxGasDistHeap(stations: IntArray, k: Int): Double {
        val n = stations.size
        val pq = PriorityQueue<DoubleArray>(Comparator { a, b -> if (b[0] / b[1] < a[0] / a[1]) -1 else 1 })
        for (i in 0..<n - 1) {
            pq.offer(doubleArrayOf(stations[i + 1].toDouble() - stations[i], 1.toDouble()))
        }

        for (free in 0..<k) {
            val node = pq.poll()
            node[1]++
            pq.add(node)
        }

        val node = pq.poll()
        return node[0] / node[1]
    }
}
