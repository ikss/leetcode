package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonSubsequenceTest {
    @Test
    fun test1() {
        val text1 = "abcde"
        val text2 = "ace"
        val expected = 3

        assertEquals(expected, LongestCommonSubsequence.longestCommonSubsequence(text1, text2))
    }

    @Test
    fun test2() {
        val text1 = "abc"
        val text2 = "abc"
        val expected = 3

        assertEquals(expected, LongestCommonSubsequence.longestCommonSubsequence(text1, text2))
    }

    @Test
    fun test3() {
        val text1 = "abc"
        val text2 = "def"
        val expected = 0

        assertEquals(expected, LongestCommonSubsequence.longestCommonSubsequence(text1, text2))
    }
}