package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RegularExpressionMatchingTest {
    @Test
    fun test1() {
        val s = "aa"
        val p = "a"
        val expected = false

        assertEquals(expected, RegularExpressionMatching.isMatch(s, p))
    }

    @Test
    fun test2() {
        val s = "aa"
        val p = "a*"
        val expected = true

        assertEquals(expected, RegularExpressionMatching.isMatch(s, p))
    }

    @Test
    fun test3() {
        val s = "ab"
        val p = ".*"
        val expected = true

        assertEquals(expected, RegularExpressionMatching.isMatch(s, p))
    }
}