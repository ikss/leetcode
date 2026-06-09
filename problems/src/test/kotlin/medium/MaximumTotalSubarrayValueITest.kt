package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumTotalSubarrayValueITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 2)
        val k = 2
        val expected = 4L

        assertEquals(expected, MaximumTotalSubarrayValueI.maxTotalValue(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 2, 5, 1)
        val k = 3
        val expected = 12L

        assertEquals(expected, MaximumTotalSubarrayValueI.maxTotalValue(nums, k))
    }
}