package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestPalindromeTest {
    @Test
    fun test1() {
        val s = "aacecaaa"
        val expected = "aaacecaaa"

        assertEquals(expected, ShortestPalindrome.shortestPalindrome(s))
    }

    @Test
    fun test2() {
        val s = "abcd"
        val expected = "dcbabcd"

        assertEquals(expected, ShortestPalindrome.shortestPalindrome(s))
    }
}