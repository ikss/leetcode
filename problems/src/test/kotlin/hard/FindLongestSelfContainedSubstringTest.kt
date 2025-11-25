package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindLongestSelfContainedSubstringTest {
    @Test
    fun test1() {
        val s = "abba"
        val expected = 2

        assertEquals(expected, FindLongestSelfContainedSubstring.maxSubstringLength(s))
    }

    @Test
    fun test2() {
        val s = "abab"
        val expected = -1

        assertEquals(expected, FindLongestSelfContainedSubstring.maxSubstringLength(s))
    }

    @Test
    fun test3() {
        val s = "abacd"
        val expected = 4

        assertEquals(expected, FindLongestSelfContainedSubstring.maxSubstringLength(s))
    }
}