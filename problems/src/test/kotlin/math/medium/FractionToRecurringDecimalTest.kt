package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FractionToRecurringDecimalTest {

    @Test
    fun test1() {
        val dividend = 1
        val divisor = 2
        val expected = "0.5"

        assertEquals(expected, FractionToRecurringDecimal.fractionToDecimal(dividend, divisor))
    }

    @Test
    fun test2() {
        val dividend = 2
        val divisor = 1
        val expected = "2"

        assertEquals(expected, FractionToRecurringDecimal.fractionToDecimal(dividend, divisor))
    }

    @Test
    fun test3() {
        val dividend = 4
        val divisor = 333
        val expected = "0.(012)"

        assertEquals(expected, FractionToRecurringDecimal.fractionToDecimal(dividend, divisor))
    }
}
