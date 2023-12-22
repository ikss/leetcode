package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubstringWithAtMostTwoDistinctCharactersTest {
    @Test
    fun test1() {
        val s = "eceba"
        val expected = 3

        assertEquals(expected, LongestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct(s))
    }

    @Test
    fun test2() {
        val s = "ccaabbb"
        val expected = 5

        assertEquals(expected, LongestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct(s))
    }

    @Test
    fun test3() {
        val s = "a"
        val expected = 1

        assertEquals(expected, LongestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct(s))
    }
}