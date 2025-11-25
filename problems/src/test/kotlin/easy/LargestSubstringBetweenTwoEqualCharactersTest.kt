package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestSubstringBetweenTwoEqualCharactersTest {
    @Test
    fun test1map() {
        val input = "aa"
        val expected = 0

        assertEquals(expected, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersMap(input))
    }

    @Test
    fun test2map() {
        val input = "abca"
        val expected = 2

        assertEquals(expected, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersMap(input))
    }

    @Test
    fun test3map() {
        val input = "cbzxy"
        val expected = -1

        assertEquals(expected, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersMap(input))
    }

    @Test
    fun test1array() {
        val input = "aa"
        val expected = 0

        assertEquals(expected, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersArray(input))
    }

    @Test
    fun test2array() {
        val input = "abca"
        val expected = 2

        assertEquals(expected, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersArray(input))
    }

    @Test
    fun test3array() {
        val input = "cbzxy"
        val expected = -1

        assertEquals(expected, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersArray(input))
    }
}