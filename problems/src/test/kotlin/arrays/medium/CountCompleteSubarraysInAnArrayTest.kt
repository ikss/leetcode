package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountCompleteSubarraysInAnArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 1, 2, 2)
        val expected = 4

        assertEquals(expected, CountCompleteSubarraysInAnArray.countCompleteSubarrays(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 5, 5, 5)
        val expected = 10

        assertEquals(expected, CountCompleteSubarraysInAnArray.countCompleteSubarrays(nums))
    }
}