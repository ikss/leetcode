package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidPalindromeIIITest {
    @Test
    fun test1() {
        val s = "abcdeca"
        val k = 2
        val expected = true

        assertEquals(expected, ValidPalindromeIII.isValidPalindrome(s, k))
    }

    @Test
    fun test2() {
        val s = "abbababa"
        val k = 1
        val expected = true

        assertEquals(expected, ValidPalindromeIII.isValidPalindrome(s, k))
    }
}