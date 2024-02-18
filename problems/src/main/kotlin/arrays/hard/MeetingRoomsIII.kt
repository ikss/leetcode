package arrays.hard

import java.util.*


/**
 * You are given an integer n. There are n rooms numbered from 0 to n - 1.
 *
 * You are given a 2D integer array meetings where `meetings[i] = [starti, endi]` means that a meeting will be held
 * during the half-closed time interval `[starti, endi)`. All the values of starti are unique.
 *
 * Meetings are allocated to rooms in the following manner:
 *
 * Each meeting will take place in the unused room with the lowest number.
 * If there are no available rooms, the meeting will be delayed until a room becomes free.
 * The delayed meeting should have the same duration as the original meeting.
 * When a room becomes unused, meetings that have an earlier original start time should be given the room.
 * Return the number of the room that held the most meetings. If there are multiple rooms,
 * return the room with the lowest number.
 *
 * A half-closed interval `[a, b)` is the interval between a and b including a and not including b.
 *
 * [URL](https://leetcode.com/problems/meeting-rooms-iii/)
 */
object MeetingRoomsIII {
    fun mostBooked(n: Int, meetings: Array<IntArray>): Int {
        val count = IntArray(n)

        val freeRooms = PriorityQueue<Int>()
        for (r in 0 until n) {
            freeRooms.offer(r)
        }
        val busy = PriorityQueue<Pair<Long, Int>> { i1, i2 ->
            val compareEnd = i1.first.compareTo(i2.first)
            if (compareEnd == 0) {
                i1.second.compareTo(i2.second)
            } else {
                compareEnd
            }
        }

        meetings.sortBy { it[0] }

        for ((start, end) in meetings) {
            while (busy.isNotEmpty() && busy.peek().first <= start) {
                freeRooms.offer(busy.poll().second)
            }
            val (newEnd, nextroom) = if (freeRooms.isEmpty()) {
                val (e, r) = busy.poll()
                e + end - start to r
            } else {
                end.toLong() to freeRooms.poll()
            }
            count[nextroom]++
            busy.offer(newEnd to nextroom)
        }

        var max = -1
        var index = -1

        for (i in count.indices) {
            val c = count[i]
            if (c > max) {
                max = c
                index = i
            }
        }
        return index
    }
}