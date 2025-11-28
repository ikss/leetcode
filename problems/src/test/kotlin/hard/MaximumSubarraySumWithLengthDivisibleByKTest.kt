package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSubarraySumWithLengthDivisibleByKTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2)
        val k = 1
        val expected = 3L

        assertEquals(expected, MaximumSubarraySumWithLengthDivisibleByK.maxSubarraySum(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, -2, -3, -4, -5)
        val k = 4
        val expected = -10L

        assertEquals(expected, MaximumSubarraySumWithLengthDivisibleByK.maxSubarraySum(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-5, 1, 2, -3, 4)
        val k = 2
        val expected = 4L

        assertEquals(expected, MaximumSubarraySumWithLengthDivisibleByK.maxSubarraySum(nums, k))
    }
}