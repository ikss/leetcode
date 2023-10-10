package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMakeArrayContinuousTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 2, 5, 3)
        val expected = 0

        assertEquals(expected, MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 5, 6)
        val expected = 1

        assertEquals(expected, MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 10, 100, 1000)
        val expected = 3

        assertEquals(expected, MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums))
    }
}