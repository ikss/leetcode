package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestSubsequenceOfDistinctCharactersTest {
    @Test
    fun test1() {
        val s = "bcabc"
        val expected = "abc"

        assertEquals(expected, SmallestSubsequenceOfDistinctCharacters.smallestSubsequence(s))
    }

    @Test
    fun test2() {
        val s = "cbacdcbc"
        val expected = "acdb"

        assertEquals(expected, SmallestSubsequenceOfDistinctCharacters.smallestSubsequence(s))
    }
}