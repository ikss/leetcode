package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveOutermostParenthesesTest {
    @Test
    fun test1() {
        val s = "(()())(())"
        val expected = "()()()"

        assertEquals(expected, RemoveOutermostParentheses.removeOuterParentheses(s))
    }

    @Test
    fun test2() {
        val s = "(()())(())(()(()))"
        val expected = "()()()()(())"

        assertEquals(expected, RemoveOutermostParentheses.removeOuterParentheses(s))
    }

    @Test
    fun test3() {
        val s = "()()"
        val expected = ""

        assertEquals(expected, RemoveOutermostParentheses.removeOuterParentheses(s))
    }
}