package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSubstringsContainingAllThreeCharactersTest {
    @Test
    fun test1() {
        val s = "abcabc"
        val expected = 10

        assertEquals(expected, NumberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings(s))
    }

    @Test
    fun test2() {
        val s = "aaacb"
        val expected = 3

        assertEquals(expected, NumberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings(s))
    }
    
    @Test
    fun test3() {
        val s = "abc"
        val expected = 1

        assertEquals(expected, NumberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings(s))
    }
}