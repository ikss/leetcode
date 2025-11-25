package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DataStreamAsDisjointIntervalsTest {
    @Test
    fun test1() {
        val summaryRanges = DataStreamAsDisjointIntervals.SummaryRanges()
        summaryRanges.addNum(1)                                         // arr = [1]
        var result = arrayOf(intArrayOf(1, 1))
        assertArrayEquals(result, summaryRanges.getIntervals())               // return [[1, 1]]
        summaryRanges.addNum(3)                                         // arr = [1, 3]
        result = arrayOf(intArrayOf(1, 1), intArrayOf(3, 3))
        assertArrayEquals(result, summaryRanges.getIntervals())               // return [[1, 1], [3, 3]]
        summaryRanges.addNum(7)                                         // arr = [1, 3, 7]
        result = arrayOf(intArrayOf(1, 1), intArrayOf(3, 3), intArrayOf(7, 7))
        assertArrayEquals(result, summaryRanges.getIntervals())               // return [[1, 1], [3, 3], [7, 7]]
        summaryRanges.addNum(2)                                         // arr = [1, 2, 3, 7]
        result = arrayOf(intArrayOf(1, 3), intArrayOf(7, 7))
        assertArrayEquals(result, summaryRanges.getIntervals())               // return [[1, 3], [7, 7]]
        summaryRanges.addNum(6)                                         // arr = [1, 2, 3, 6, 7]
        result = arrayOf(intArrayOf(1, 3), intArrayOf(6, 7))
        assertArrayEquals(result, summaryRanges.getIntervals())               // return [[1, 3], [6, 7]]
    }
}