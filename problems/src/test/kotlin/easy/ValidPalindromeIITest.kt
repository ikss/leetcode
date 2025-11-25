package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidPalindromeIITest {
    @Test
    fun test1() {
        val s = "aba"
        val expected = true

        assertEquals(expected, ValidPalindromeII.validPalindrome(s))
    }

    @Test
    fun test2() {
        val s = "abca"
        val expected = true

        assertEquals(expected, ValidPalindromeII.validPalindrome(s))
    }

    @Test
    fun test3() {
        val s = "abc"
        val expected = false

        assertEquals(expected, ValidPalindromeII.validPalindrome(s))
    }
}