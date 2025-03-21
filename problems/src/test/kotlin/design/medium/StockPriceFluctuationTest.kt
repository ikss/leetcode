package design.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StockPriceFluctuationTest {
    @Test
    fun test1() {
        val stockPrice = StockPriceFluctuation.StockPrice()
        // Timestamps are [1] with corresponding prices [10].
        stockPrice.update(1, 10)
        // Timestamps are [1,2] with corresponding prices [10,5].
        stockPrice.update(2, 5)
        // return 5, the latest timestamp is 2 with the price being 5.
        assertEquals(5, stockPrice.current())
        // return 10, the maximum price is 10 at timestamp 1.
        assertEquals(10, stockPrice.maximum())

        // The previous timestamp 1 had the wrong price, so it is updated to 3.
        stockPrice.update(1, 3)

        // Timestamps are [1,2] with corresponding prices [3,5].
        // return 5, the maximum price is 5 after the correction.
        assertEquals(5, stockPrice.maximum())
        // Timestamps are [1,2,4] with corresponding prices [3,5,2].
        stockPrice.update(4, 2)
        // return 2, the minimum price is 2 at timestamp 4.
        assertEquals(2, stockPrice.minimum())
    }
}