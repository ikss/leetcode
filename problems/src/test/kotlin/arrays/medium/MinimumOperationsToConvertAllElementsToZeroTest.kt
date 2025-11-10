package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToConvertAllElementsToZeroTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 2)
        val expected = 1

        assertEquals(expected, MinimumOperationsToConvertAllElementsToZero.minOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 1, 2, 1)
        val expected = 3

        assertEquals(expected, MinimumOperationsToConvertAllElementsToZero.minOperations(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 1, 2, 1, 2)
        val expected = 4

        assertEquals(expected, MinimumOperationsToConvertAllElementsToZero.minOperations(nums))
    }
}