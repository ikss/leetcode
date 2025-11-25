package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumAddToMakeParenthesesValidTest {
    @Test
    fun test1() {
        val s = "())"
        val expected = 1

        assertEquals(expected, MinimumAddToMakeParenthesesValid.minAddToMakeValid(s))
    }

    @Test
    fun test2() {
        val s = "((("
        val expected = 3

        assertEquals(expected, MinimumAddToMakeParenthesesValid.minAddToMakeValid(s))
    }
}