package arrays.medium

/**
 * Given an array of intervals intervals where `intervals[i] = [starti, endi]`, return the minimum number of intervals
 * you need to remove to make the rest of the intervals non-overlapping.
 *
 * [URL](https://leetcode.com/problems/non-overlapping-intervals/)
 */
object NonOverlappingIntervals {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        intervals.sortBy { it[0] }
        var result = 0
        var maxEndTime = Int.MIN_VALUE

        for ((start, end) in intervals) {
            if (start >= maxEndTime) {
                maxEndTime = end
            } else {
                result++
            }
        }

        return result
    }
}
