package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStocksWithCooldownTest {

    @Test
    fun testSimple1() {
        val arr = intArrayOf(1, 2, 3, 0, 2)
        val expected = 3

        assertEquals(expected, BestTimeToBuyAndSellStocksWithCooldown.maxProfit(arr))
    }

    @Test
    fun testSimple2() {
        val arr = intArrayOf(1)
        val expected = 0

        assertEquals(expected, BestTimeToBuyAndSellStocksWithCooldown.maxProfit(arr))
    }
}