package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfNiceSubarraysTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2, 1, 1)
        val k = 3
        val expected = 2

        assertEquals(expected, CountNumberOfNiceSubarrays.numberOfSubarrays(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 4, 6)
        val k = 1
        val expected = 0

        assertEquals(expected, CountNumberOfNiceSubarrays.numberOfSubarrays(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2)
        val k = 2
        val expected = 16

        assertEquals(expected, CountNumberOfNiceSubarrays.numberOfSubarrays(nums, k))
    }
}