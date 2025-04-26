package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountOfInterestingSubarraysTest {
    @Test
    fun test1() {
        val nums = listOf(3, 2, 4)
        val modulo = 2
        val k = 1
        val expected = 3L

        assertEquals(expected, CountOfInterestingSubarrays.countInterestingSubarrays(nums, modulo, k))
    }

    @Test
    fun test2() {
        val nums = listOf(3, 1, 9, 6)
        val modulo = 3
        val k = 0
        val expected = 2L

        assertEquals(expected, CountOfInterestingSubarrays.countInterestingSubarrays(nums, modulo, k))
    }

}