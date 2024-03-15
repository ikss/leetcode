package arrays.hard

import java.util.*


/**
 * Given an array of meeting time intervals intervals where `intervals[i] = [starti, endi]`,
 * return the minimum number of conference rooms required.
 *
 * [URL](https://leetcode.com/problems/meeting-rooms-ii/)
 */
object MeetingRoomsII {
    fun minMeetingRooms(intervals: Array<IntArray>): Int {
        intervals.sortBy { it[0] }

        val pq = PriorityQueue<Int>()
        pq.offer(intervals[0][1])

        for (i in 1 until intervals.size) {
            if (intervals[i][0] >= pq.peek()) {
                pq.poll()
            }
            pq.add(intervals[i][1])
        }

        return pq.size
    }
}