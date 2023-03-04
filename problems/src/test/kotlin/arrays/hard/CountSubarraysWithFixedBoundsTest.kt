package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubarraysWithFixedBoundsTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 5, 2, 7, 5)
        val minK = 1
        val maxK = 5
        val expected = 2L

        assertEquals(expected, CountSubarraysWithFixedBounds.countSubarrays(nums, minK, maxK))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1)
        val minK = 1
        val maxK = 1
        val expected = 10L

        assertEquals(expected, CountSubarraysWithFixedBounds.countSubarrays(nums, minK, maxK))
    }
}