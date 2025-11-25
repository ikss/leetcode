package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximalScoreAfterApplyingKOperationsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(10, 10, 10, 10, 10)
        val k = 5
        val expected = 50L

        assertEquals(expected, MaximalScoreAfterApplyingKOperations.maxKelements(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 10, 3, 3, 3)
        val k = 3
        val expected = 17L

        assertEquals(expected, MaximalScoreAfterApplyingKOperations.maxKelements(nums, k))
    }
}