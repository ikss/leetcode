package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSmoothDescentPeriodsOfStockTest {
    @Test
    fun test1() {
        val prices = intArrayOf(3, 2, 1, 4)
        val expected = 7L

        assertEquals(expected, NumberOfSmoothDescentPeriodsOfStock.getDescentPeriods(prices))
    }

    @Test
    fun test2() {
        val prices = intArrayOf(8, 6, 7, 7)
        val expected = 4L

        assertEquals(expected, NumberOfSmoothDescentPeriodsOfStock.getDescentPeriods(prices))
    }

    @Test
    fun test3() {
        val prices = intArrayOf(1)
        val expected = 1L

        assertEquals(expected, NumberOfSmoothDescentPeriodsOfStock.getDescentPeriods(prices))
    }
}