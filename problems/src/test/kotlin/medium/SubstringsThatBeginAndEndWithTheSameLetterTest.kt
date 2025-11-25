package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubstringsThatBeginAndEndWithTheSameLetterTest {
    @Test
    fun test1() {
        val s = "abcba"
        val expected = 7L

        assertEquals(expected, SubstringsThatBeginAndEndWithTheSameLetter.numberOfSubstrings(s))
    }

    @Test
    fun test2() {
        val s = "abacad"
        val expected = 9L

        assertEquals(expected, SubstringsThatBeginAndEndWithTheSameLetter.numberOfSubstrings(s))
    }
    
    @Test
    fun test3() {
        val s = "aaaa"
        val expected = 10L

        assertEquals(expected, SubstringsThatBeginAndEndWithTheSameLetter.numberOfSubstrings(s))
    }
}