package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfGoodSubarraysTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val k = 10
        val expected = 1L

        assertEquals(expected, CountTheNumberOfGoodSubarrays.countGood(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 1, 4, 3, 2, 2, 4)
        val k = 2
        val expected = 4L

        assertEquals(expected, CountTheNumberOfGoodSubarrays.countGood(nums, k))
    }
}