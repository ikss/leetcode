package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSideLengthOfSquareWithSumLessThanOrEqualToThresholdTest {
    @Test
    fun test1() {
        val mat = arrayOf(
            intArrayOf(1, 1, 3, 2, 4, 3, 2),
            intArrayOf(1, 1, 3, 2, 4, 3, 2),
            intArrayOf(1, 1, 3, 2, 4, 3, 2)
        )
        val threshold = 4
        val expected = 2

        assertEquals(expected, MaximumSideLengthOfSquareWithSumLessThanOrEqualToThreshold.maxSideLength(mat, threshold))
    }

    @Test
    fun test2() {
        val mat = arrayOf(
            intArrayOf(2, 2, 2, 2, 2),
            intArrayOf(2, 2, 2, 2, 2),
            intArrayOf(2, 2, 2, 2, 2),
            intArrayOf(2, 2, 2, 2, 2),
            intArrayOf(2, 2, 2, 2, 2),
        )
        val threshold = 1
        val expected = 0

        assertEquals(expected, MaximumSideLengthOfSquareWithSumLessThanOrEqualToThreshold.maxSideLength(mat, threshold))
    }
}