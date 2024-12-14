package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ContinuousSubarraysTest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 4, 2, 4)
        val expected = 8L

        assertEquals(expected, ContinuousSubarrays.continuousSubarrays(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 6L

        assertEquals(expected, ContinuousSubarrays.continuousSubarrays(nums))
    }
}