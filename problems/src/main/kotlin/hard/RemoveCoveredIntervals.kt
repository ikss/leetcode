package hard

import java.util.PriorityQueue

/**
 * Given an array intervals where `intervals[i] = [li, ri]` represent the interval `[li, ri)`,
 * remove all intervals that are covered by another interval in the list.
 *
 * The interval `[a, b)` is covered by the interval `[c, d)` if and only if c <= a and b <= d.
 *
 * Return the number of remaining intervals.
 *
 * [URL](https://leetcode.com/problems/remove-covered-intervals/)
 */
object RemoveCoveredIntervals {
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
        val pq = PriorityQueue<IntArray> { i1, i2 ->
            if (i1[0] == i2[0]) {
                i2[1] - i1[1]
            } else {
                i1[0] - i2[0]
            }
        }

        for (i in intervals) {
            pq.offer(i)
        }

        var result = intervals.size
        while (pq.isNotEmpty()) {
            val curr = pq.poll()

            while (pq.isNotEmpty()) {
                val next = pq.peek()
                if (next[1] <= curr[1]) {
                    pq.poll()
                    result--
                } else {
                    break
                }
            }
        }

        return result
    }
}
