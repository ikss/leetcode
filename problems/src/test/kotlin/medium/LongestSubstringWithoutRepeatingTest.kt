package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingTest {

    @Test
    fun test1() {
        val s = "abcabcbb"
        val expected = 3

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test2() {
        val s = "bbbbb"
        val expected = 1

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test3() {
        val s = ""
        val expected = 0

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test4() {
        val s = "pwwkew"
        val expected = 3

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test5() {
        val s = "aab"
        val expected = 2

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test6() {
        val s = "a"
        val expected = 1

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test1WOSet() {
        val s = "abcabcbb"
        val expected = 3

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun test2WOSet() {
        val s = "bbbbb"
        val expected = 1

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun test3WOSet() {
        val s = ""
        val expected = 0

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun test4WOSet() {
        val s = "pwwkew"
        val expected = 3
        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun test5WOSet() {
        val s = "aab"
        val expected = 2
        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun test6WOSet() {
        val s = "a"
        val expected = 1
        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }
}
