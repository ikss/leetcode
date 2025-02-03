package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 4, 3, 3, 2)
        val output = 2

        assertEquals(output, LongestStrictlyIncreasingOrStrictlyDecreasingSubarray.longestMonotonicSubarray(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(3, 3, 3, 3)
        val output = 1

        assertEquals(output, LongestStrictlyIncreasingOrStrictlyDecreasingSubarray.longestMonotonicSubarray(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(3, 2, 1)
        val output = 3

        assertEquals(output, LongestStrictlyIncreasingOrStrictlyDecreasingSubarray.longestMonotonicSubarray(input))
    }
}