package easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    @Test
    fun test1() {
        val s = "()"

        assertTrue(ValidParentheses.isValid(s))
    }

    @Test
    fun test2() {
        val s = "(]"

        assertFalse(ValidParentheses.isValid(s))
    }

    @Test
    fun test3() {
        val s = "]"
        assertFalse(ValidParentheses.isValid(s))
    }

    @Test
    fun test4() {
        val s = "([{(({}))}])"
        assertTrue(ValidParentheses.isValid(s))
    }
}
