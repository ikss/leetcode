package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfOperationsWithTheSameScoreIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 1, 2, 3, 4)
        val expected = 3

        assertEquals(expected, MaximumNumberOfOperationsWithTheSameScoreII.maxOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 2, 6, 1, 4)
        val expected = 2

        assertEquals(expected, MaximumNumberOfOperationsWithTheSameScoreII.maxOperations(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 9, 7, 3, 2, 7, 4, 12, 2, 6)
        val expected = 2

        assertEquals(expected, MaximumNumberOfOperationsWithTheSameScoreII.maxOperations(nums))
    }
}