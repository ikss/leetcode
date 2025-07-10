package arrays.medium

/**
 * You are given an integer eventTime denoting the duration of an event.
 * You are also given two integer arrays startTime and endTime, each of length n.
 *
 * These represent the start and end times of n non-overlapping meetings that occur during the event between time t = 0
 * and time t = eventTime, where the ith meeting occurs during the time `[startTime[i], endTime[i]]`.
 *
 * You can reschedule at most one meeting by moving its start time while maintaining the same duration,
 * such that the meetings remain non-overlapping, to maximize the longest continuous period of free time during the event.
 *
 * Return the maximum amount of free time possible after rearranging the meetings.
 *
 * Note that the meetings can not be rescheduled to a time outside the event and they should remain non-overlapping.
 *
 * Note: In this version, it is valid for the relative ordering of the meetings to change after rescheduling one meeting.
 *
 * [URL](https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-ii/)
 */
object RescheduleMeetingsForMaximumFreeTimeII {
    fun maxFreeTime(eventTime: Int, startTime: IntArray, endTime: IntArray): Int {
        val n = startTime.size
        val fromLeft = IntArray(n)
        fromLeft[1] = startTime[0] - 0

        for (i in 2 until n) {
            val start = startTime[i - 1]
            val end = endTime[i - 2]

            fromLeft[i] = maxOf(fromLeft[i - 1], start - end)
        }

        val fromRight = IntArray(n)
        fromRight[n - 2] = eventTime - endTime[n - 1]

        for (i in n - 3 downTo 0) {
            val end = startTime[i + 2]
            val start = endTime[i + 1]

            fromRight[i] = maxOf(fromRight[i + 1], end - start)
        }

        var result = 0

        for (i in 0 until n) {
            val meetLength = endTime[i] - startTime[i]

            val prevGap = if (i == 0) startTime[0] else startTime[i] - endTime[i - 1]
            val nextGap = if (i == n - 1) eventTime - endTime[i] else startTime[i + 1] - endTime[i]

            val currResult = if (fromLeft[i] >= meetLength || fromRight[i] >= meetLength) {
                meetLength
            } else {
                0
            }
            result = maxOf(prevGap + nextGap + currResult, result)
        }

        return result
    }
}
