package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScoreOfParenthesesTest {
    @Test
    fun test1() {
        val s = "()"
        val expected = 1

        assertEquals(expected, ScoreOfParentheses.scoreOfParentheses(s))
    }

    @Test
    fun test2() {
        val s = "(())"
        val expected = 2

        assertEquals(expected, ScoreOfParentheses.scoreOfParentheses(s))
    }

    @Test
    fun test3() {
        val s = "()()"
        val expected = 2

        assertEquals(expected, ScoreOfParentheses.scoreOfParentheses(s))
    }
}