package arrays.hard

import java.util.*

/**
 * There is a one-dimensional garden on the x-axis. The garden starts at the point 0 and ends at the point n.
 * (i.e The length of the garden is n).
 *
 * There are n + 1 taps located at points `z`[0, 1, ..., n]` in the garden.
 *
 * Given an integer n and an integer array ranges of length n + 1 where `ranges[i]` (0-indexed) means the i-th tap
 * can water the area `[i - ranges[i], i + ranges[i]]` if it was open.
 *
 * Return the minimum number of taps that should be open to water the whole garden,
 * If the garden cannot be watered return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/)
 */
object MinimumNumberOfTapsToOpenToWaterGarden {
    fun minTapsOwnSolution(n: Int, ranges: IntArray): Int {
        val pq = PriorityQueue<Pair<Int, Int>> { a1, a2 -> a2.second.compareTo(a1.second) }
        var start = 0
        var result = 0

        for (i in 0..n) {
            val r = ranges[i]
            pq.offer(i - r to i + r)
        }

        while (!pq.isEmpty()) {
            val temp = ArrayList<Pair<Int, Int>>()
            for (i in 0 until pq.size) {
                val node = pq.poll()
                if (node.first <= start) {
                    result++
                    if (node.second >= n) return result
                    start = node.second
                    pq.addAll(temp)
                    break
                }
                temp.add(node)
            }
        }

        return -1
    }
}