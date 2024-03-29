package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPalindromicSubstringTest {

    @Test
    fun test1() {
        val s = "babad"
        val expected = "bab"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(s))
    }

    @Test
    fun test2() {
        val s = "cbbd"
        val expected = "bb"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(s))
    }

    @Test
    fun test3() {
        val s = "a"
        val expected = "a"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(s))
    }

    @Test
    fun test4() {
        val s = "ac"
        val expected = "a"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(s))
    }

    @Test
    fun test1expand() {
        val s = "babad"
        val expected = "bab"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindromeExpand(s))
    }

    @Test
    fun test2expand() {
        val s = "cbbd"
        val expected = "bb"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindromeExpand(s))
    }

    @Test
    fun test3expand() {
        val s = "a"
        val expected = "a"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindromeExpand(s))
    }

    @Test
    fun test4expand() {
        val s = "ac"
        val expected = "a"

        assertEquals(expected, LongestPalindromicSubstring.longestPalindromeExpand(s))
    }
}
