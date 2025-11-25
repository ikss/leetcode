package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumWindowSubstringTest {

    @Test
    fun test1() {
        val s = "ADOBECODEBANC"
        val t = "ABC"
        val expected = "BANC"

        assertEquals(expected, MinimumWindowSubstring.minWindow(s, t))
    }

    @Test
    fun test2() {
        val s = "a"
        val t = "a"
        val expected = "a"

        assertEquals(expected, MinimumWindowSubstring.minWindow(s, t))
    }

    @Test
    fun test3() {
        val s = "a"
        val t = "aa"
        val expected = ""

        assertEquals(expected, MinimumWindowSubstring.minWindow(s, t))
    }
}