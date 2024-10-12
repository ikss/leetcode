package arrays.medium

import java.util.*


/**
 * You are given a 2D integer array intervals where `intervals[i] = [lefti, righti]` represents the inclusive interval
 * `[lefti, righti]`.
 *
 * You have to divide the intervals into one or more groups such that each interval is in exactly one group,
 * and no two intervals that are in the same group intersect each other.
 *
 * Return the minimum number of groups you need to make.
 *
 * Two intervals intersect if there is at least one common number between them. For example, the intervals `[1, 5]` and
 * `[5, 8]` intersect.
 *
 * [URL](https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/)
 */
object DivideIntervalsIntoMinimumNumberOfGroups {

    fun minGroups(intervals: Array<IntArray>): Int {
        val pointToCount = TreeMap<Int, Int>()

        for ((start, end) in intervals) {
            pointToCount.merge(start, 1, Int::plus)
            pointToCount.merge(end + 1, -1, Int::plus)
        }

        var concurrentIntervals = 0
        var maxConcurrentIntervals = 0

        for (v in pointToCount.values) {
            concurrentIntervals += v
            maxConcurrentIntervals = maxOf(maxConcurrentIntervals, concurrentIntervals)
        }

        return maxConcurrentIntervals
    }
}
