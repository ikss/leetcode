package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TotalWavinessOfNumbersInRangeITest {
    @Test
    fun test1() {
        val num1 = 120
        val num2 = 130
        val expected = 3

        assertEquals(expected, TotalWavinessOfNumbersInRangeI.totalWaviness(num1, num2))
    }

    @Test
    fun test2() {
        val num1 = 198
        val num2 = 202
        val expected = 3

        assertEquals(expected, TotalWavinessOfNumbersInRangeI.totalWaviness(num1, num2))
    }

    @Test
    fun test3() {
        val num1 = 4848
        val num2 = 4848
        val expected = 2

        assertEquals(expected, TotalWavinessOfNumbersInRangeI.totalWaviness(num1, num2))
    }
}