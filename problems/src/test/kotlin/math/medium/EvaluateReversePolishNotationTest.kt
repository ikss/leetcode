package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvaluateReversePolishNotationTest {

    @Test
    fun test1() {
        val tokens = arrayOf("2", "1", "+", "3", "*")
        val expected = 9

        assertEquals(expected, EvaluateReversePolishNotation.evalRPN(tokens))
    }

    @Test
    fun test2() {
        val tokens = arrayOf("4", "13", "5", "/", "+")
        val expected = 6

        assertEquals(expected, EvaluateReversePolishNotation.evalRPN(tokens))
    }

    @Test
    fun test3() {
        val tokens = arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")
        val expected = 22

        assertEquals(expected, EvaluateReversePolishNotation.evalRPN(tokens))
    }
}