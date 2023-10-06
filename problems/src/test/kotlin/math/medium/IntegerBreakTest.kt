package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntegerBreakTest {
    @Test
    fun test1dp() {
        val n = 2
        val expected = 1

        assertEquals(expected, IntegerBreak.integerBreakDp(n))
    }

    @Test
    fun test2dp() {
        val n = 10
        val expected = 36

        assertEquals(expected, IntegerBreak.integerBreakDp(n))
    }

    @Test
    fun test1math() {
        val n = 2
        val expected = 1

        assertEquals(expected, IntegerBreak.integerBreakMath(n))
    }

    @Test
    fun test2math() {
        val n = 10
        val expected = 36

        assertEquals(expected, IntegerBreak.integerBreakMath(n))
    }

}