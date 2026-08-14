package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumLengthSubstringWithTwoOccurrencesTest {
    @Test
    fun test1() {
        val s = "bcbbbcba"
        val expected = 4

        assertEquals(expected, MaximumLengthSubstringWithTwoOccurrences.maximumLengthSubstring(s))
    }

    @Test
    fun test2() {
        val s = "aaaa"
        val expected = 2

        assertEquals(expected, MaximumLengthSubstringWithTwoOccurrences.maximumLengthSubstring(s))
    }
}