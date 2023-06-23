package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestArithmeticSubsequenceTest {

    @Test
    fun test1() {
        val nums = intArrayOf(3, 6, 9, 12)
        val expected = 4

        assertEquals(expected, LongestArithmeticSubsequence.longestArithSeqLength(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(9, 4, 7, 2, 10)
        val expected = 3

        assertEquals(expected, LongestArithmeticSubsequence.longestArithSeqLength(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(20, 1, 15, 3, 10, 5, 8)
        val expected = 4

        assertEquals(expected, LongestArithmeticSubsequence.longestArithSeqLength(nums))
    }
}