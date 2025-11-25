package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestRepeatingSubstringTest {
    @Test
    fun test1BinarySearch() {
        val s = "abcd"
        val expected = 0

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringBinarySearch(s))
    }

    @Test
    fun test2BinarySearch() {
        val s = "abbaba"
        val expected = 2

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringBinarySearch(s))
    }

    @Test
    fun test3BinarySearch() {
        val s = "aabcaabdaab"
        val expected = 3

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringBinarySearch(s))
    }

    @Test
    fun test4BinarySearch() {
        val s = "aaaaa"
        val expected = 4

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringBinarySearch(s))
    }
    @Test
    fun test1Dp() {
        val s = "abcd"
        val expected = 0

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringDp(s))
    }

    @Test
    fun test2Dp() {
        val s = "abbaba"
        val expected = 2

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringDp(s))
    }

    @Test
    fun test3Dp() {
        val s = "aabcaabdaab"
        val expected = 3

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringDp(s))
    }

    @Test
    fun test4Dp() {
        val s = "aaaaa"
        val expected = 4

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstringDp(s))
    }
}