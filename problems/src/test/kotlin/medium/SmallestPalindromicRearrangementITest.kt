package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestPalindromicRearrangementITest {
    @Test
    fun test1() {
        val s = "z"
        val expected = "z"

        assertEquals(expected, SmallestPalindromicRearrangementI.smallestPalindrome(s))
    }

    @Test
    fun test2() {
        val s = "babab"
        val expected = "abbba"

        assertEquals(expected, SmallestPalindromicRearrangementI.smallestPalindrome(s))
    }

    @Test
    fun test3() {
        val s = "daccad"
        val expected = "acddca"

        assertEquals(expected, SmallestPalindromicRearrangementI.smallestPalindrome(s))
    }
}