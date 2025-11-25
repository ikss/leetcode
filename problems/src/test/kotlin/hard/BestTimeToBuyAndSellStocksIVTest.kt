package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStocksIVTest {

    @Test
    fun test1() {
        val arr = intArrayOf(2, 4, 1)
        val k = 2
        val expected = 2

        assertEquals(expected, BestTimeToBuyAndSellStocksIV.maxProfit(k, arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(3, 2, 6, 5, 0, 3)
        val k = 2
        val expected = 7

        assertEquals(expected, BestTimeToBuyAndSellStocksIV.maxProfit(k, arr))
    }

}