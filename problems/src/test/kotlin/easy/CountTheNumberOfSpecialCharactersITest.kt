package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfSpecialCharactersITest {
    @Test
    fun test1() {
        val word = "aaAbcBC"
        val expected = 3

        assertEquals(expected, CountTheNumberOfSpecialCharactersI.numberOfSpecialChars(word))
    }

    @Test
    fun test2() {
        val word = "abc"
        val expected = 0

        assertEquals(expected, CountTheNumberOfSpecialCharactersI.numberOfSpecialChars(word))
    }

    @Test
    fun test3() {
        val word = "abBCab"
        val expected = 1

        assertEquals(expected, CountTheNumberOfSpecialCharactersI.numberOfSpecialChars(word))
    }
}