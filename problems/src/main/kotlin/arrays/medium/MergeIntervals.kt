package arrays.medium

import java.util.*

/**
 * Given an array of intervals where `intervals[i] = [starti, endi]`, merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 * [URL](https://leetcode.com/problems/merge-intervals/)
 */
object MergeIntervals {
    fun mergeOwn(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }
        val merged = TreeMap<Int, Int>()


        for ((start, end) in intervals) {
            val overlappedEnd = merged.floorEntry(end)
            if (overlappedEnd != null && overlappedEnd.value >= start) {
                merged[overlappedEnd.key] = maxOf(end, overlappedEnd.value)
            } else {
                merged[start] = end
            }
        }
        return merged.entries.map { intArrayOf(it.key, it.value) }.toTypedArray()
    }

    fun mergeLinkedList(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }
        
        val merged = LinkedList<IntArray>()
        for (interval in intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.last()[1] < interval[0]) {
                merged.add(interval)
            } else {
                merged.last()[1] = maxOf(merged.last()[1], interval[1])
            }
        }
        return merged.toTypedArray()
    }
}
