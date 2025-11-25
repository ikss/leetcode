package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStocksTest {

    @Test
    fun test1simple() {
        val arr = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitSimple(arr))
    }

    @Test
    fun test2simple() {
        val arr = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitSimple(arr))
    }

    @Test
    fun test1kadane() {
        val arr = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitKadane(arr))
    }

    @Test
    fun test2kadane() {
        val arr = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0

        assertEquals(expected, BestTimeToBuyAndSellStocks.maxProfitKadane(arr))
    }
}
