package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubsequenceRepeatedKTimesTest {
    @Test
    fun test1() {
        val s = "letsleetcode"
        val k = 2
        val expected = "let"

        assertEquals(expected, LongestSubsequenceRepeatedKTimes.longestSubsequenceRepeatedK(s, k))
    }

    @Test
    fun test2() {
        val s = "bb"
        val k = 2
        val expected = "b"

        assertEquals(expected, LongestSubsequenceRepeatedKTimes.longestSubsequenceRepeatedK(s, k))
    }

    @Test
    fun test3() {
        val s = "ab"
        val k = 2
        val expected = ""

        assertEquals(expected, LongestSubsequenceRepeatedKTimes.longestSubsequenceRepeatedK(s, k))
    }
}