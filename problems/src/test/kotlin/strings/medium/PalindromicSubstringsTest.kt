package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromicSubstringsTest {
    @Test
    fun test1() {
        val s = "abc"
        val expected = 3

        assertEquals(expected, PalindromicSubstrings.countSubstrings(s))
    }

    @Test
    fun test2() {
        val s = "aaa"
        val expected = 6

        assertEquals(expected, PalindromicSubstrings.countSubstrings(s))
    }

    @Test
    fun test3() {
        val s = "aaaa"
        val expected = 10

        assertEquals(expected, PalindromicSubstrings.countSubstrings(s))
    }
}