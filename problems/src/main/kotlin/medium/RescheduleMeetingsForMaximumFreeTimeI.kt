package medium

/**
 * You are given an integer eventTime denoting the duration of an event,
 * where the event occurs from time t = 0 to time t = eventTime.
 *
 * You are also given two integer arrays startTime and endTime, each of length n.
 * These represent the start and end time of n non-overlapping meetings,
 * where the ith meeting occurs during the time `[startTime[i], endTime[i]]`.
 *
 * You can reschedule at most k meetings by moving their start time while maintaining the same duration,
 * to maximize the longest continuous period of free time during the event.
 *
 * The relative order of all the meetings should stay the same and they should remain non-overlapping.
 *
 * Return the maximum amount of free time possible after rearranging the meetings.
 *
 * Note that the meetings can not be rescheduled to a time outside the event.
 *
 * [URL](https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-i/)
 */
object RescheduleMeetingsForMaximumFreeTimeI {
    fun maxFreeTime(eventTime: Int, k: Int, startTime: IntArray, endTime: IntArray): Int {
        val n = startTime.size

        var t = 0
        var result = 0

        for (i in 0..<n) {
            t += endTime[i] - startTime[i]
            val left = if (i < k) 0 else endTime[i - k]
            val right = if (i == n - 1) eventTime else startTime[i + 1]

            result = maxOf(result, right - left - t)
            if (i >= k - 1) {
                t -= endTime[i - k + 1] - startTime[i - k + 1]
            }
        }

        return result
    }
}
