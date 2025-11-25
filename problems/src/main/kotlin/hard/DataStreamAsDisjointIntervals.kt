package hard

import java.util.*

/**
 * Given a data stream input of non-negative integers a1, a2, ..., an, summarize the numbers seen so far as a list of
 * disjoint intervals.
 *
 * Implement the SummaryRanges class:
 *
 * SummaryRanges() Initializes the object with an empty stream.
 * void addNum(int value) Adds the integer value to the stream.
 * `int[][]` getIntervals() Returns a summary of the integers in the stream currently as a list of
 * disjoint intervals `[starti, endi]`. The answer should be sorted by starti.
 *
 * [URL](https://leetcode.com/problems/data-stream-as-disjoint-intervals/)
 */
object DataStreamAsDisjointIntervals {
    class SummaryRanges {
        private var intervals = TreeMap<Int, Int>()

        fun addNum(value: Int) {
            val smallEntry = intervals.floorEntry(value)
            var left = value
            var right = value
            if (smallEntry != null) {
                val previous = smallEntry.value
                if (previous >= value) {
                    return
                }
                if (previous == value - 1) {
                    left = smallEntry.key
                }
            }
            val maxEntry = intervals.higherEntry(value)
            if (maxEntry != null && maxEntry.key == value + 1) {
                right = maxEntry.value
                intervals.remove(value + 1)
            }
            intervals[left] = right
        }

        fun getIntervals(): Array<IntArray> {
            val answer = Array(intervals.size) { IntArray(2) }
            var ind = 0
            for ((key, value) in intervals) {
                answer[ind][0] = key
                answer[ind][1] = value
                ind++
            }
            return answer
        }
    }
}
