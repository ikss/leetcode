package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumSubarraysInValidSplitTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 6, 3, 4, 3)
        val expected = 2

        assertEquals(expected, MinimumSubarraysInValidSplit.validSubarraySplit(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 5)
        val expected = 2

        assertEquals(expected, MinimumSubarraysInValidSplit.validSubarraySplit(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 1)
        val expected = -1

        assertEquals(expected, MinimumSubarraysInValidSplit.validSubarraySplit(nums))
    }
}