package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestSubstringWithoutRepeatingTest {

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
    fun testWOSet1() {
        val s = "abcabcbb"
        val expected = 3

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun testWOSet2() {
        val s = "bbbbb"
        val expected = 1

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun testWOSet3() {
        val s = ""
        val expected = 0

        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun testWOSet4() {
        val s = "pwwkew"
        val expected = 3
        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun testWOSet5() {
        val s = "aab"
        val expected = 2
        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }

    @Test
    fun testWOSet6() {
        val s = "a"
        val expected = 1
        assertEquals(expected, LongestSubstringWithoutRepeating.lengthOfLongestSubstringWOSet(s))
    }
}
