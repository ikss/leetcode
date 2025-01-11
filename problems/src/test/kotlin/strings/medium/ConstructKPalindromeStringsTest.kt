package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructKPalindromeStringsTest {
    @Test
    fun test1() {
        val s = "annabelle"
        val k = 2
        val expected = true

        assertEquals(expected, ConstructKPalindromeStrings.canConstruct(s, k))
    }

    @Test
    fun test2() {
        val s = "leetcode"
        val k = 3
        val expected = false

        assertEquals(expected, ConstructKPalindromeStrings.canConstruct(s, k))
    }
}