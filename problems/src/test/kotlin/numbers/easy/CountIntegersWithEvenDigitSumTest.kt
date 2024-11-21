package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountIntegersWithEvenDigitSumTest {
    @Test
    fun test1() {
        val num = 4
        val expected = 2

        assertEquals(expected, CountIntegersWithEvenDigitSum.countEven(num))
    }

    @Test
    fun test2() {
        val num = 30
        val expected = 14

        assertEquals(expected, CountIntegersWithEvenDigitSum.countEven(num))
    }
}