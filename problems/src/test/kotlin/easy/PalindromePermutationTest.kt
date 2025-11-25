package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromePermutationTest {
    @Test
    fun test1() {
        val s = "code"
        val expected = false

        assertEquals(expected, PalindromePermutation.canPermutePalindrome(s))
    }

    @Test
    fun test2() {
        val s = "aab"
        val expected = true

        assertEquals(expected, PalindromePermutation.canPermutePalindrome(s))
    }

    @Test
    fun test3() {
        val s = "carerac"
        val expected = true

        assertEquals(expected, PalindromePermutation.canPermutePalindrome(s))
    }
}