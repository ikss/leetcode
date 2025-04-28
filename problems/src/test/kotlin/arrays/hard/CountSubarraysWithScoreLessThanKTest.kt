package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubarraysWithScoreLessThanKTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 4, 3, 5)
        val k = 10L
        val expected = 6L

        assertEquals(expected, CountSubarraysWithScoreLessThanK.countSubarrays(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1)
        val k = 5L
        val expected = 5L

        assertEquals(expected, CountSubarraysWithScoreLessThanK.countSubarrays(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 2, 2)
        val k = 1L
        val expected = 0L

        assertEquals(expected, CountSubarraysWithScoreLessThanK.countSubarrays(nums, k))
    }
}