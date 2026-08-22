package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckDivisibilityByDigitSumAndProductTest {
    @Test
    fun test1() {
        val n = 99
        val expected = true

        assertEquals(expected, CheckDivisibilityByDigitSumAndProduct.checkDivisibility(n))
    }

    @Test
    fun test2() {
        val n = 23
        val expected = false

        assertEquals(expected, CheckDivisibilityByDigitSumAndProduct.checkDivisibility(n))
    }
}