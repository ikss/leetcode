package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestSubarrayWithSumAtLeastKTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = 1

        assertEquals(expected, ShortestSubarrayWithSumAtLeastK.shortestSubarray(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2)
        val k = 4
        val expected = -1

        assertEquals(expected, ShortestSubarrayWithSumAtLeastK.shortestSubarray(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, -1, 2)
        val k = 3
        val expected = 3

        assertEquals(expected, ShortestSubarrayWithSumAtLeastK.shortestSubarray(nums, k))
    }
}