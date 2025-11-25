package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMakeArrayXOREqualToKTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 3, 4)
        val k = 1
        val expected = 2

        assertEquals(expected, MinimumNumberOfOperationsToMakeArrayXOREqualToK.minOperations(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 0, 2, 0)
        val k = 0
        val expected = 0

        assertEquals(expected, MinimumNumberOfOperationsToMakeArrayXOREqualToK.minOperations(nums, k))
    }
}