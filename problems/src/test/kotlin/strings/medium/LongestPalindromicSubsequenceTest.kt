package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPalindromicSubsequenceTest {
    @Test
    fun test1() {
        val s = "bbbab"
        val expected = 4

        assertEquals(expected, LongestPalindromicSubsequence.longestPalindromeSubseq(s))
    }

    @Test
    fun test2() {
        val s = "cbbd"
        val expected = 2

        assertEquals(expected, LongestPalindromicSubsequence.longestPalindromeSubseq(s))
    }

    @Test
    fun test3() {
        val s = "a"
        val expected = 1

        assertEquals(expected, LongestPalindromicSubsequence.longestPalindromeSubseq(s))
    }
}