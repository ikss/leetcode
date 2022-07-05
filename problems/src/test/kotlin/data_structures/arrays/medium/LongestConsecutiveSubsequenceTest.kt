package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestConsecutiveSubsequenceTest {

    @Test
    fun test1() {
        val nums = intArrayOf(100, 4, 200, 1, 3, 2)
        val expected = 4

        assertEquals(expected, LongestConsecutiveSubsequence.longestConsecutive(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
        val expected = 9

        assertEquals(expected, LongestConsecutiveSubsequence.longestConsecutive(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 0, 1, 2)
        val expected = 3

        assertEquals(expected, LongestConsecutiveSubsequence.longestConsecutive(nums))
    }

    @Test
    fun test1Optimized() {
        val nums = intArrayOf(100, 4, 200, 1, 3, 2)
        val expected = 4

        assertEquals(expected, LongestConsecutiveSubsequence.longestConsecutiveOptimized(nums))
    }

    @Test
    fun test2Optimized() {
        val nums = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
        val expected = 9

        assertEquals(expected, LongestConsecutiveSubsequence.longestConsecutiveOptimized(nums))
    }

    @Test
    fun test3Optimized() {
        val nums = intArrayOf(1, 0, 1, 2)
        val expected = 3

        assertEquals(expected, LongestConsecutiveSubsequence.longestConsecutiveOptimized(nums))
    }
}
