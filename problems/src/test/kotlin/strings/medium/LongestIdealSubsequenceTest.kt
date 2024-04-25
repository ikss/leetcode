package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestIdealSubsequenceTest {
    @Test
    fun test1() {
        val s = "acfgbd"
        val k = 2
        val expected = 4

        assertEquals(expected, LongestIdealSubsequence.longestIdealString(s, k))
    }

    @Test
    fun test2() {
        val s = "abcd"
        val k = 3
        val expected = 4

        assertEquals(expected, LongestIdealSubsequence.longestIdealString(s, k))
    }
}