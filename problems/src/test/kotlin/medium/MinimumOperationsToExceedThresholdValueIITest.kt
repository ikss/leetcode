package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToExceedThresholdValueIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 11, 10, 1, 3)
        val k = 10
        val expected = 2

        assertEquals(expected, MinimumOperationsToExceedThresholdValueII.minOperations(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 2, 4, 9)
        val k = 20
        val expected = 4

        assertEquals(expected, MinimumOperationsToExceedThresholdValueII.minOperations(nums, k))
    }
}