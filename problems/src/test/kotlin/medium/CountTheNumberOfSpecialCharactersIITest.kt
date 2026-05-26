package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfSpecialCharactersIITest {
    @Test
    fun test1() {
        val word = "aaAbcBC"
        val expected = 3

        assertEquals(expected, CountTheNumberOfSpecialCharactersII.numberOfSpecialChars(word))
    }

    @Test
    fun test2() {
        val word = "abc"
        val expected = 0

        assertEquals(expected, CountTheNumberOfSpecialCharactersII.numberOfSpecialChars(word))
    }

    @Test
    fun test3() {
        val word = "AbBCab"
        val expected = 0

        assertEquals(expected, CountTheNumberOfSpecialCharactersII.numberOfSpecialChars(word))
    }
}