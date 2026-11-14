package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumPositiveSumSubarrayTest {
    @Test
    fun test1() {
        val nums = listOf(3, -2, 1, 4)
        val l = 2
        val r = 3
        val expected = 1

        assertEquals(expected, MinimumPositiveSumSubarray.minimumSumSubarray(nums, l, r))
    }

    @Test
    fun test2() {
        val nums = listOf(-2, 2, -3, 1)
        val l = 2
        val r = 3
        val expected = -1

        assertEquals(expected, MinimumPositiveSumSubarray.minimumSumSubarray(nums, l, r))
    }
}