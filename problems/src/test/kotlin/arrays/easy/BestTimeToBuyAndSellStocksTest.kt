package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BestTimeToBuyAndSellStocksTest {

    @Test
    fun testSimple1() {
        val arr = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitSimple(arr))
    }

    @Test
    fun testSimple2() {
        val arr = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitSimple(arr))
    }

    @Test
    fun testKadane1() {
        val arr = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitKadane(arr))
    }

    @Test
    fun testKadane2() {
        val arr = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitKadane(arr))
    }
}
