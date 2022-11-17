package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestValidParenthesesTest {

    @Test
    fun test1() {
        val s = "(()"
        val expected = 2

        assertEquals(expected, LongestValidParentheses.longestValidParentheses(s))
    }

    @Test
    fun test2() {
        val s = ")()())"
        val expected = 4

        assertEquals(expected, LongestValidParentheses.longestValidParentheses(s))
    }

    @Test
    fun test3() {
        val s = ""
        val expected = 0

        assertEquals(expected, LongestValidParentheses.longestValidParentheses(s))
    }

}
