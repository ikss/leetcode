package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    @Test
    fun test1() {
        val prices = intArrayOf(1, 3, 2, 8, 4, 9)
        val fee = 2
        val expected = 8

        assertEquals(expected, BestTimeToBuyAndSellStockWithTransactionFee.maxProfit(prices, fee))
    }

    @Test
    fun test2() {
        val prices = intArrayOf(1, 3, 7, 5, 10, 3)
        val fee = 3
        val expected = 6

        assertEquals(expected, BestTimeToBuyAndSellStockWithTransactionFee.maxProfit(prices, fee))
    }
}