package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PowTest {

    @Test
    fun test1() {
        val x = 2.0
        val n = 10
        val expected = 1024.0

        assertEquals(expected, Pow.myPow(x, n), 0.00001)
    }

    @Test
    fun test2() {
        val x = 2.1
        val n = 3
        val expected = 9.261

        assertEquals(expected, Pow.myPow(x, n), 0.00001)
    }

    @Test
    fun test3() {
        val x = 2.0
        val divisor = -2
        val expected = 0.25

        assertEquals(expected, Pow.myPow(x, divisor), 0.00001)
    }

    @Test
    fun test4() {
        val x = 2.0
        val divisor = Int.MIN_VALUE
        val expected = 0.0

        assertEquals(expected, Pow.myPow(x, divisor), 0.00001)
    }
}
