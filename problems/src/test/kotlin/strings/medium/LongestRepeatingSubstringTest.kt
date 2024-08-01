package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestRepeatingSubstringTest {
    @Test
    fun test1() {
        val s = "abcd"
        val expected = 0

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstring(s))
    }

    @Test
    fun test2() {
        val s = "abbaba"
        val expected = 2

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstring(s))
    }

    @Test
    fun test3() {
        val s = "aabcaabdaab"
        val expected = 3

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstring(s))
    }

    @Test
    fun test4() {
        val s = "aaaaa"
        val expected = 4

        assertEquals(expected, LongestRepeatingSubstring.longestRepeatingSubstring(s))
    }
}