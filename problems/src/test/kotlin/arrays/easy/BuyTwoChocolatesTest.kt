package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BuyTwoChocolatesTest {
    @Test
    fun test1() {
        val prices = intArrayOf(1, 2, 2)
        val money = 3
        val expected = 0

        assertEquals(expected, BuyTwoChocolates.buyChoco(prices, money))
    }

    @Test
    fun test2() {
        val prices = intArrayOf(3, 2, 3)
        val money = 3
        val expected = 3

        assertEquals(expected, BuyTwoChocolates.buyChoco(prices, money))
    }

    @Test
    fun test3() {
        val prices = intArrayOf(3, 1, 5, 4, 2)
        val money = 7
        val expected = 4

        assertEquals(expected, BuyTwoChocolates.buyChoco(prices, money))
    }
}