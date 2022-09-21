package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStocksIITest {

    @Test
    fun testSimple1() {
        val arr = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 7

        assertEquals(expected, BestTimeToBuyAndSellStocksII.maxProfit(arr))
    }

    @Test
    fun testSimple2() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val expected = 4

        assertEquals(expected, BestTimeToBuyAndSellStocksII.maxProfit(arr))
    }

    @Test
    fun testKadane1() {
        val arr = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0

        assertEquals(expected, BestTimeToBuyAndSellStocksII.maxProfit(arr))
    }
}
