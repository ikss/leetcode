package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestIncreasingSubsequenceTest {

    @Test
    fun test1() {
        val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
        val expected = 4

        assertEquals(expected, LongestIncreasingSubsequence.lengthOfLIS(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 0, 3, 2, 3)
        val expected = 4

        assertEquals(expected, LongestIncreasingSubsequence.lengthOfLIS(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(7, 7, 7, 7, 7, 7, 7)
        val expected = 1

        assertEquals(expected, LongestIncreasingSubsequence.lengthOfLIS(nums))
    }
}
