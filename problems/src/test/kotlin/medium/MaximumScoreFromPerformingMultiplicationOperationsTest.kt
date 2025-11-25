package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumScoreFromPerformingMultiplicationOperationsTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val multipliers = intArrayOf(3, 2, 1)
        val expected = 14

        assertEquals(expected, MaximumScoreFromPerformingMultiplicationOperations.maximumScore(nums, multipliers))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-5, -3, -3, -2, 7, 1)
        val multipliers = intArrayOf(-10, -5, 3, 4, 6)
        val expected = 102

        assertEquals(expected, MaximumScoreFromPerformingMultiplicationOperations.maximumScore(nums, multipliers))
    }
}