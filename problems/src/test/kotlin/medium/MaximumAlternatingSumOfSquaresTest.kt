package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAlternatingSumOfSquaresTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 12

        assertEquals(expected, MaximumAlternatingSumOfSquares.maxAlternatingSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, -1, 2, -2, 3, -3)
        val expected = 12

        assertEquals(expected, MaximumAlternatingSumOfSquares.maxAlternatingSum(nums))
    }
}