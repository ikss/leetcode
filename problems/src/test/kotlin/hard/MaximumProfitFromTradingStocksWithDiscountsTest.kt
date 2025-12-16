package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProfitFromTradingStocksWithDiscountsTest {
    @Test
    fun test1() {
        val n = 2
        val present = intArrayOf(1, 2)
        val future = intArrayOf(4, 3)
        val hierarchy = arrayOf(intArrayOf(1, 2))
        val budget = 3
        val expected = 5

        assertEquals(expected, MaximumProfitFromTradingStocksWithDiscounts.maxProfit(n, present, future, hierarchy, budget))
    }

    @Test
    fun test2() {
        val n = 2
        val present = intArrayOf(3, 4)
        val future = intArrayOf(5, 8)
        val hierarchy = arrayOf(intArrayOf(1, 2))
        val budget = 4
        val expected = 4

        assertEquals(expected, MaximumProfitFromTradingStocksWithDiscounts.maxProfit(n, present, future, hierarchy, budget))
    }

    @Test
    fun test3() {
        val n = 3
        val present = intArrayOf(4, 6, 8)
        val future = intArrayOf(7, 9, 11)
        val hierarchy = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3))
        val budget = 10
        val expected = 10

        assertEquals(expected, MaximumProfitFromTradingStocksWithDiscounts.maxProfit(n, present, future, hierarchy, budget))
    }

    @Test
    fun test4() {
        val n = 3
        val present = intArrayOf(5, 2, 3)
        val future = intArrayOf(8, 5, 6)
        val hierarchy = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))
        val budget = 7
        val expected = 12

        assertEquals(expected, MaximumProfitFromTradingStocksWithDiscounts.maxProfit(n, present, future, hierarchy, budget))
    }
}