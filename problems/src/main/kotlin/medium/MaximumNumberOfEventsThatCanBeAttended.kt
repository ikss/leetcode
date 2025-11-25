package medium

import java.util.*
import kotlin.math.max


/**
 * You are given an array of events where `events[i] = [startDayi, endDayi]`.
 * Every event i starts at startDayi and ends at endDayi.
 *
 * You can attend an event i at any day d where startTimei <= d <= endTimei. You can only attend one event at any time d.
 *
 * Return the maximum number of events you can attend.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/)
 */
object MaximumNumberOfEventsThatCanBeAttended {

    fun maxEvents(events: Array<IntArray>): Int {
        val n = events.size
        var maxDay = 0
        for (event in events) {
            maxDay = max(maxDay, event[1])
        }

        val pq = PriorityQueue<Int>()
        events.sortWith { e1, e2 -> e1[0] - e2[0] }
        var result = 0
        var currDay = 1
        var currEvent = 0

        while (currDay <= maxDay) {
            while (currEvent < n && events[currEvent][0] <= currDay) {
                pq.offer(events[currEvent][1])
                currEvent++
            }
            while (pq.isNotEmpty() && pq.peek()!! < currDay) {
                pq.poll()
            }
            if (pq.poll() != null) {
                result++
            }
            currDay++
        }

        return result
    }
}
