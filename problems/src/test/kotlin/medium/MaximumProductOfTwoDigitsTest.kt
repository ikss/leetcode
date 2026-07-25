package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProductOfTwoDigitsTest {
    @Test
    fun test1() {
        val n = 31
        val expected = 3

        assertEquals(expected, MaximumProductOfTwoDigits.maxProduct(n))
    }

    @Test
    fun test2() {
        val n = 22
        val expected = 4

        assertEquals(expected, MaximumProductOfTwoDigits.maxProduct(n))
    }

    @Test
    fun test3() {
        val n = 124
        val expected = 8

        assertEquals(expected, MaximumProductOfTwoDigits.maxProduct(n))
    }
}