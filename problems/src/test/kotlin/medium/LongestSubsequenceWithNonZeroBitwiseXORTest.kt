package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubsequenceWithNonZeroBitwiseXORTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 2

        assertEquals(expected, LongestSubsequenceWithNonZeroBitwiseXOR.longestSubsequence(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4)
        val expected = 3

        assertEquals(expected, LongestSubsequenceWithNonZeroBitwiseXOR.longestSubsequence(nums))
    }
}