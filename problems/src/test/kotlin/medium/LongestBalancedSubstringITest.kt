package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestBalancedSubstringITest {
    @Test
    fun test1() {
        val s = "abbac"
        val expected = 4

        assertEquals(expected, LongestBalancedSubstringI.longestBalanced(s))
    }

    @Test
    fun test2() {
        val s = "zzabccy"
        val expected = 4

        assertEquals(expected, LongestBalancedSubstringI.longestBalanced(s))
    }

    @Test
    fun test3() {
        val s = "aba"
        val expected = 2

        assertEquals(expected, LongestBalancedSubstringI.longestBalanced(s))
    }
}