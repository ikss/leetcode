package strings.easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ValidParenthesisTest {

    @Test
    fun test1() {
        val s = "()"

        assertTrue(ValidParenthesis.isValid(s))
    }

    @Test
    fun test2() {
        val s = "(]"

        assertFalse(ValidParenthesis.isValid(s))
    }

    @Test
    fun test3() {
        val s = "]"
        assertFalse(ValidParenthesis.isValid(s))
    }

    @Test
    fun test4() {
        val s = "([{(({}))}])"
        assertTrue(ValidParenthesis.isValid(s))
    }
}
