package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindThePivotIntegerTest {
    @Test
    fun test1() {
        val n = 8
        val expected = 6

        assertEquals(expected, FindThePivotInteger.pivotInteger(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 1

        assertEquals(expected, FindThePivotInteger.pivotInteger(n))
    }

    @Test
    fun test3() {
        val n = 4
        val expected = -1

        assertEquals(expected, FindThePivotInteger.pivotInteger(n))
    }
}