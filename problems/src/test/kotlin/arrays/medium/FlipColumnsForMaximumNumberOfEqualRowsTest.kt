package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlipColumnsForMaximumNumberOfEqualRowsTest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 1),
        )
        val expected = 1
        assertEquals(expected, FlipColumnsForMaximumNumberOfEqualRows.maxEqualRowsAfterFlips(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
        )
        val expected = 2
        assertEquals(expected, FlipColumnsForMaximumNumberOfEqualRows.maxEqualRowsAfterFlips(input))
    }

    @Test
    fun test3() {
        val input = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 0),
        )
        val expected = 2
        assertEquals(expected, FlipColumnsForMaximumNumberOfEqualRows.maxEqualRowsAfterFlips(input))
    }
}