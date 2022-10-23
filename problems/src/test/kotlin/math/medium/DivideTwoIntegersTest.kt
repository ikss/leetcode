package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DivideTwoIntegersTest {

    @Test
    fun test1() {
        val dividend = 10
        val divisor = 3
        val expected = 3

        assertEquals(expected, DivideTwoIntegers.divide(dividend, divisor))
    }

    @Test
    fun test2() {
        val dividend = Int.MAX_VALUE
        val divisor = -1
        val expected = -2147483647

        assertEquals(expected, DivideTwoIntegers.divide(dividend, divisor))
    }

    @Test
    fun test3() {
        val dividend = Int.MIN_VALUE
        val divisor = -1
        val expected = 2147483647

        assertEquals(expected, DivideTwoIntegers.divide(dividend, divisor))
    }
}
