package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubarraysWithKDifferentIntegersTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1, 2, 3)
        val k = 2
        val expected = 7

        assertEquals(expected, SubarraysWithKDifferentIntegers.subarraysWithKDistinct(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 1, 3, 4)
        val k = 3
        val expected = 3

        assertEquals(expected, SubarraysWithKDifferentIntegers.subarraysWithKDistinct(nums, k))
    }

}