package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AdjacentIncreasingSubarraysDetectionIITest {
    @Test
    fun test1() {
        val nums = listOf(2, 5, 7, 8, 9, 2, 3, 4, 3, 1)
        val expected = 3

        assertEquals(expected, AdjacentIncreasingSubarraysDetectionII.maxIncreasingSubarrays(nums))
    }

    @Test
    fun test2() {
        val nums = listOf(1, 2, 3, 4, 4, 4, 4, 5, 6, 7)
        val expected = 2

        assertEquals(expected, AdjacentIncreasingSubarraysDetectionII.maxIncreasingSubarrays(nums))
    }
}