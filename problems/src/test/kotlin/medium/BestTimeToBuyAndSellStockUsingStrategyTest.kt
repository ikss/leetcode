package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStockUsingStrategyTest {
    @Test
    fun test1() {
        val prices = intArrayOf(4, 2, 8)
        val strategy = intArrayOf(-1, 0, 1)
        val k = 2
        val expected = 10L

        assertEquals(expected, BestTimeToBuyAndSellStockUsingStrategy.maxProfit(prices, strategy, k))
    }

    @Test
    fun test2() {
        val prices = intArrayOf(5, 4, 3)
        val strategy = intArrayOf(1, 1, 0)
        val k = 2
        val expected = 9L

        assertEquals(expected, BestTimeToBuyAndSellStockUsingStrategy.maxProfit(prices, strategy, k))
    }

    @Test
    fun test3() {
        val prices = intArrayOf(5, 8)
        val strategy = intArrayOf(-1, -1)
        val k = 2
        val expected = 8L

        assertEquals(expected, BestTimeToBuyAndSellStockUsingStrategy.maxProfit(prices, strategy, k))
    }

    @Test
    fun test4() {
        val prices = intArrayOf(5, 8, 8)
        val strategy = intArrayOf(0, 0, -1)
        val k = 2
        val expected = 8L

        assertEquals(expected, BestTimeToBuyAndSellStockUsingStrategy.maxProfit(prices, strategy, k))
    }
}