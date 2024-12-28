package arrays.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximumSumOf3NonOverlappingSubarraysTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1, 2, 6, 7, 5, 1)
        val k = 2
        val expected = intArrayOf(0, 3, 5)

        assertArrayEquals(expected, MaximumSumOf3NonOverlappingSubarrays.maxSumOfThreeSubarrays(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 1, 2, 1, 2, 1, 2, 1)
        val k = 2
        val expected = intArrayOf(0, 2, 4)

        assertArrayEquals(expected, MaximumSumOf3NonOverlappingSubarrays.maxSumOfThreeSubarrays(nums, k))
    }
}