package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestArithmeticSubsequenceOfGivenDifferenceTest {

    @Test
    fun test1() {
        val arr = intArrayOf(1, 2, 3, 4)
        val difference = 1
        val expected = 4

        assertEquals(expected, LongestArithmeticSubsequenceOfGivenDifference.longestSubsequence(arr, difference))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 3, 5, 7)
        val difference = 1
        val expected = 1

        assertEquals(expected, LongestArithmeticSubsequenceOfGivenDifference.longestSubsequence(arr, difference))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(1, 5, 7, 8, 5, 3, 4, 2, 1)
        val difference = -2
        val expected = 4

        assertEquals(expected, LongestArithmeticSubsequenceOfGivenDifference.longestSubsequence(arr, difference))
    }
}