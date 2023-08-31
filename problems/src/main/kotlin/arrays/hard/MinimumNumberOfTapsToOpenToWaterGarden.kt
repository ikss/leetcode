package arrays.hard

import java.util.*
import kotlin.math.max
import kotlin.math.min


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
    fun minTapsOwnGreedy(n: Int, ranges: IntArray): Int {
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

    fun minTapsDp(n: Int, ranges: IntArray): Int {
        val inf = 1_000_000_000
        // Create an array to store the minimum number of taps needed for each position
        val dp = IntArray(n + 1) { inf }

        // Initialize the starting position of the garden
        dp[0] = 0
        for (i in 0..n) {
            // Calculate the leftmost position reachable by the current tap
            val tapStart = maxOf(0, i - ranges[i])
            // Calculate the rightmost position reachable by the current tap
            val tapEnd = minOf(n, i + ranges[i])
            for (j in tapStart..tapEnd) {
                // Update with the minimum number of taps
                dp[tapEnd] = minOf(dp[tapEnd], dp[j] + 1)
            }
        }

        return if (dp[n] == inf) -1 else dp[n]
    }

    fun minTapsGreedy(n: Int, ranges: IntArray): Int {
        // Create an array to track the maximum reach for each position
        val maxReach = IntArray(n + 1)

        // Calculate the maximum reach for each tap
        for (i in ranges.indices) {
            // Calculate the leftmost position the tap can reach
            val start = maxOf(0, i - ranges[i])
            // Calculate the rightmost position the tap can reach
            val end = minOf(n, i + ranges[i])

            // Update the maximum reach for the leftmost position
            maxReach[start] = maxOf(maxReach[start], end)
        }

        // Number of taps used
        var taps = 0
        // Current rightmost position reached
        var currEnd = 0
        // Next rightmost position that can be reached
        var nextEnd = 0

        // Iterate through the garden
        for (i in 0..n) {
            // Current position cannot be reached
            if (i > nextEnd) {
                return -1
            }

            // Increment taps when moving to a new tap
            if (i > currEnd) {
                taps++
                // Move to the rightmost position that can be reached
                currEnd = nextEnd
            }

            // Update the next rightmost position that can be reached
            nextEnd = max(nextEnd, maxReach[i])
        }

        // Return the minimum number of taps used
        return taps
    }
}