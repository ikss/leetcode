package arrays.medium

/**
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 *
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 *
 * Return intervals after the insertion.
 *
 * [URL](https://leetcode.com/problems/insert-interval/)
 */
object InsertInterval {
    fun insertInterval(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val ans = mutableListOf<IntArray>()
        var index = 0
        var (start, end) = newInterval

        //find start value for new interval
        while (index < intervals.size && intervals[index][1] < start) {
            ans.add(intervals[index])
            index++
        }
        if (index < intervals.size) {
            start = minOf(start, intervals[index][0])
        }
        //find end value for new interval
        while (index < intervals.size && intervals[index][0] <= end) {
            index++
        }
        if (index > 0) {
            end = maxOf(end, intervals[index - 1][1])
        }
        //insert new interval
        ans.add(intArrayOf(start, end))
        //add remaining alements to ans
        while (index < intervals.size) {
            ans.add(intervals[index])
            index++
        }
        return ans.toTypedArray()
    }
}
