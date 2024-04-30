package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWonderfulSubstringsTest {
    @Test
    fun test1() {
        val s = "aba"
        val expected = 4

        assertEquals(expected, NumberOfWonderfulSubstrings.wonderfulSubstrings(s))
    }

    @Test
    fun test2() {
        val s = "aabb"
        val expected = 9

        assertEquals(expected, NumberOfWonderfulSubstrings.wonderfulSubstrings(s))
    }

    @Test
    fun test3() {
        val s = "he"
        val expected = 2

        assertEquals(expected, NumberOfWonderfulSubstrings.wonderfulSubstrings(s))
    }
}