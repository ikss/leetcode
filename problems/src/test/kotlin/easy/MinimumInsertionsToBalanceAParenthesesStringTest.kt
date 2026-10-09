package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumInsertionsToBalanceAParenthesesStringTest {
    @Test
    fun test1() {
        val s = "(()))"
        val expected = 1

        assertEquals(expected, MinimumInsertionsToBalanceAParenthesesString.minInsertions(s))
    }

    @Test
    fun test2() {
        val s = "())"
        val expected = 0

        assertEquals(expected, MinimumInsertionsToBalanceAParenthesesString.minInsertions(s))
    }

    @Test
    fun test3() {
        val s = "))())("
        val expected = 3

        assertEquals(expected, MinimumInsertionsToBalanceAParenthesesString.minInsertions(s))
    }
}