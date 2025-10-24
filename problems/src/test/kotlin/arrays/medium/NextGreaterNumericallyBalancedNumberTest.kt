package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NextGreaterNumericallyBalancedNumberTest {
    @Test
    fun test1() {
        val n = 1
        val expected = 22
        val actual = NextGreaterNumericallyBalancedNumber.nextBeautifulNumber(n)

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val n = 1000
        val expected = 1333
        val actual = NextGreaterNumericallyBalancedNumber.nextBeautifulNumber(n)

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val n = 3000
        val expected = 3133
        val actual = NextGreaterNumericallyBalancedNumber.nextBeautifulNumber(n)

        assertEquals(expected, actual)
    }
}