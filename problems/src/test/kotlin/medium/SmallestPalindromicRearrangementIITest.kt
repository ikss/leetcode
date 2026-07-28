package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestPalindromicRearrangementIITest {
    @Test
    fun test1() {
        val s = "abba"
        val k = 2
        val expected = "baab"

        assertEquals(expected, SmallestPalindromicRearrangementII.smallestPalindrome(s, k))
    }

    @Test
    fun test2() {
        val s = "aa"
        val k = 2
        val expected = ""

        assertEquals(expected, SmallestPalindromicRearrangementII.smallestPalindrome(s, k))
    }

    @Test
    fun test3() {
        val s = "bacab"
        val k = 1
        val expected = "abcba"

        assertEquals(expected, SmallestPalindromicRearrangementII.smallestPalindrome(s, k))
    }
}