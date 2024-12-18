package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FinalPricesWithSpecialDiscountInShopTest {
    @Test
    fun test1() {
        val prices = intArrayOf(8, 4, 6, 2, 3)
        val expected = intArrayOf(4, 2, 4, 2, 3)

        assertArrayEquals(expected, FinalPricesWithSpecialDiscountInShop.finalPrices(prices))
    }

    @Test
    fun test2() {
        val prices = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        assertArrayEquals(expected, FinalPricesWithSpecialDiscountInShop.finalPrices(prices))
    }
}