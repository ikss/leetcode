package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WaysToSplitArrayIntoGoodSubarraysTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 0, 0, 1)
        val expected = 3

        assertEquals(expected, WaysToSplitArrayIntoGoodSubarrays.numberOfGoodSubarraySplits(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 0)
        val expected = 1

        assertEquals(expected, WaysToSplitArrayIntoGoodSubarrays.numberOfGoodSubarraySplits(nums))
    }
}