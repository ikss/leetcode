package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAscendingSubarraySumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(10, 20, 30, 5, 10, 50)
        val expected = 65

        assertEquals(expected, MaximumAscendingSubarraySum.maxAscendingSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, 20, 30, 40, 50)
        val expected = 150

        assertEquals(expected, MaximumAscendingSubarraySum.maxAscendingSum(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(12, 17, 15, 13, 10, 11, 12)
        val expected = 33

        assertEquals(expected, MaximumAscendingSubarraySum.maxAscendingSum(nums))
    }
}