package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LexicographicallySmallestPalindromeTest {
    @Test
    fun test1() {
        val input = "ab"
        val expected = "aba"

        assertEquals(expected, LexicographicallySmallestPalindrome.makeSmallestPalindrome(input))
    }

    @Test
    fun test2() {
        val input = "abcd"
        val expected = "abba"

        assertEquals(expected, LexicographicallySmallestPalindrome.makeSmallestPalindrome(input))
    }

    @Test
    fun test3() {
        val input = "seven"
        val expected = "neven"

        assertEquals(expected, LexicographicallySmallestPalindrome.makeSmallestPalindrome(input))
    }
}