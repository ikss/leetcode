package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSizeSubarraySumEqualsKTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, -1, 5, -2, 3)
        val k = 3
        val expected = 4

        assertEquals(expected, MaximumSizeSubarraySumEqualsK.maxSubArrayLen(nums, k))
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(-2, -1, 2, 1)
        val k = 1
        val expected = 2

        assertEquals(expected, MaximumSizeSubarraySumEqualsK.maxSubArrayLen(nums, k))
    }
}