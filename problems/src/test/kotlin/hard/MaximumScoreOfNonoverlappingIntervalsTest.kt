package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumScoreOfNonoverlappingIntervalsTest {
    @Test
    fun test1() {
        val intervals = listOf(
            listOf(1, 3, 2),
            listOf(4, 5, 2),
            listOf(1, 5, 5),
            listOf(6, 9, 3),
            listOf(6, 7, 1),
            listOf(8, 9, 1),
        )
        val expected = intArrayOf(2, 3)

        assertEquals(expected, MaximumScoreOfNonoverlappingIntervals.maximumWeight(intervals))
    }

    @Test
    fun test2() {
        val intervals = listOf(
            listOf(5, 8, 1),
            listOf(6, 7, 7),
            listOf(4, 7, 3),
            listOf(9, 10, 6),
            listOf(7, 8, 2),
            listOf(11, 14, 3),
            listOf(3, 5, 5),
        )
        val expected = intArrayOf(1, 3, 5, 6)

        assertEquals(expected, MaximumScoreOfNonoverlappingIntervals.maximumWeight(intervals))
    }
}