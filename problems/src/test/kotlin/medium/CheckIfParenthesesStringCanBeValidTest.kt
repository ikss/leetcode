package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfParenthesesStringCanBeValidTest {
    @Test
    fun test1() {
        val s = "))()))"
        val locked = "010100"
        val expected = true

        assertEquals(expected, CheckIfParenthesesStringCanBeValid.canBeValid(s, locked))
    }

    @Test
    fun test2() {
        val s = "()()"
        val locked = "0000"
        val expected = true

        assertEquals(expected, CheckIfParenthesesStringCanBeValid.canBeValid(s, locked))
    }

    @Test
    fun test3() {
        val s = ")"
        val locked = "0"
        val expected = false

        assertEquals(expected, CheckIfParenthesesStringCanBeValid.canBeValid(s, locked))
    }
}