package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSubarraySumAfterOneOperationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, -1, -4, -3)
        val expected = 17

        assertEquals(expected, MaximumSubarraySumAfterOneOperation.maxSumAfterOperation(nums))
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(1, -1, 1, 1, -1, -1, 1)
        val expected = 4

        assertEquals(expected, MaximumSubarraySumAfterOneOperation.maxSumAfterOperation(nums))
    }
}