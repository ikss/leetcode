package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed 2D integer array of events where `events[i] = [startTimei, endTimei, valuei]`.
 * The ith event starts at startTimei and ends at endTimei, and if you attend this event, you will receive a value of
 * valuei. You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.
 *
 * Return this maximum sum.
 *
 * Note that the start time and end time is inclusive: that is, you cannot attend two events where one of them starts
 * and the other ends at the same time. More specifically, if you attend an event with end time t,
 * the next event must start at or after t + 1.
 *
 * [URL](https://leetcode.com/problems/two-best-non-overlapping-events/)
 */
object TwoBestNonOverlappingEvents {
    fun maxTwoEvents(events: Array<IntArray>): Int {
        events.sortBy { it[0] }

        var result = 0
        var maxSoFar = 0

        val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.first } )

        for ((s, e, v) in events) {
            while (pq.isNotEmpty() && pq.peek().first < s) {
                maxSoFar = maxOf(maxSoFar, pq.poll().second)
            }
            result = maxOf(result, v + maxSoFar)
            pq.offer(e to v)
        }

        return result
    }
}
