package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ParsingABooleanExpressionTest {
    @Test
    fun test1() {
        val input = "&(|(f))"
        val expected = false

        assertEquals(expected, ParsingABooleanExpression.parseBoolExpr(input))
    }

    @Test
    fun test2() {
        val input = "|(f,f,f,t)"
        val expected = true

        assertEquals(expected, ParsingABooleanExpression.parseBoolExpr(input))
    }

    @Test
    fun test3() {
        val input = "!(&(f,t))"
        val expected = true

        assertEquals(expected, ParsingABooleanExpression.parseBoolExpr(input))
    }
}