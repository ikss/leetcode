package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPalindromeTest {
    @Test
    fun test1() {
        val s = "abccccdd"
        val expected = 7

        assertEquals(expected, LongestPalindrome.longestPalindrome(s))
    }

    @Test
    fun test2() {
        val s = "a"
        val expected = 1

        assertEquals(expected, LongestPalindrome.longestPalindrome(s))
    }
}