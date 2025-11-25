package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BreakPalindromeTest {

    @Test
    fun test1() {
        val palindrome = "abccba"
        val expected = "aaccba"

        assertEquals(expected, BreakPalindrome.breakPalindrome(palindrome))
    }

    @Test
    fun test2() {
        val palindrome = "abccba"
        val expected = "aaccba"

        assertEquals(expected, BreakPalindrome.breakPalindrome(palindrome))
    }

    @Test
    fun test3() {
        val palindrome = "aba"
        val expected = "abb"

        assertEquals(expected, BreakPalindrome.breakPalindrome(palindrome))
    }
}