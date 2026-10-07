package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveInvalidParenthesesTest {
    @Test
    fun test1() {
        val s = "()())()"
        val expected = listOf("()()()", "(())()")

        assertEquals(expected, RemoveInvalidParentheses.removeInvalidParentheses(s))
    }

    @Test
    fun test2() {
        val s = "(a)())()"
        val expected = listOf("(a)()()", "(a())()")

        assertEquals(expected, RemoveInvalidParentheses.removeInvalidParentheses(s))
    }

    @Test
    fun test3() {
        val s = ")("
        val expected = listOf("")

        assertEquals(expected, RemoveInvalidParentheses.removeInvalidParentheses(s))
    }
}