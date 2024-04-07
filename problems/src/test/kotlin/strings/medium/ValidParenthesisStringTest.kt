package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidParenthesisStringTest {
    @Test
    fun test1twoStacks() {
        val s = "()"
        val expected = true

        assertEquals(expected, ValidParenthesisString.checkValidStringTwoStacks(s))
    }

    @Test
    fun test2twoStacks() {
        val s = "(*)"
        val expected = true

        assertEquals(expected, ValidParenthesisString.checkValidStringTwoStacks(s))
    }

    @Test
    fun test3twoStacks() {
        val s = "(*))"
        val expected = true

        assertEquals(expected, ValidParenthesisString.checkValidStringTwoStacks(s))
    }

    @Test
    fun test1twoPointers() {
        val s = "()"
        val expected = true

        assertEquals(expected, ValidParenthesisString.checkValidStringTwoPointers(s))
    }

    @Test
    fun test2twoPointers() {
        val s = "(*)"
        val expected = true

        assertEquals(expected, ValidParenthesisString.checkValidStringTwoPointers(s))
    }

    @Test
    fun test3twoPointers() {
        val s = "(*))"
        val expected = true

        assertEquals(expected, ValidParenthesisString.checkValidStringTwoPointers(s))
    }
}