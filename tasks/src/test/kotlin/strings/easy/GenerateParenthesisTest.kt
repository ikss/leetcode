package strings.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GenerateParenthesesTest {

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