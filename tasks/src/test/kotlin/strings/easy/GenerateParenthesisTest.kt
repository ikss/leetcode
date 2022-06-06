package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GenerateParenthesisTest {

    @Test
    fun test1() {
        val n = 0
        val expected = listOf("")
        assertEquals(expected, GenerateParentheses.generateParenthesis(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = listOf("()")
        assertEquals(expected, GenerateParentheses.generateParenthesis(n))
    }

    @Test
    fun test3() {
        val n = 3
        val expected = listOf("((()))", "(()())", "(())()", "()(())", "()()()")
        assertEquals(expected, GenerateParentheses.generateParenthesis(n))
    }
}
