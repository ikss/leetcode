package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumbersWithUniqueDigitsTest {
    @Test
    fun test1() {
        val n = 2
        val expected = 91

        assertEquals(expected, CountNumbersWithUniqueDigits.countNumbersWithUniqueDigits(n))
    }

    @Test
    fun test2() {
        val n = 0
        val expected = 1

        assertEquals(expected, CountNumbersWithUniqueDigits.countNumbersWithUniqueDigits(n))
    }
}