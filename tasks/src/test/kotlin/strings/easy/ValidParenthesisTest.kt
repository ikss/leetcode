package strings.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidParenthesisTest {

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
