package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetermineIfTwoStringsAreCloseTest {

    @Test
    fun test1() {
        val word1 = "abc"
        val word2 = "bca"
        val expected = true

        assertEquals(expected, DetermineIfTwoStringsAreClose.closeStrings(word1, word2))
    }

    @Test
    fun test2() {
        val word1 = "a"
        val word2 = "aa"
        val expected = false

        assertEquals(expected, DetermineIfTwoStringsAreClose.closeStrings(word1, word2))
    }

    @Test
    fun test3() {
        val word1 = "cabbba"
        val word2 = "abbccc"
        val expected = true

        assertEquals(expected, DetermineIfTwoStringsAreClose.closeStrings(word1, word2))
    }
}