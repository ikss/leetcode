package collections.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoinChangeTest {

    @Test
    fun test1() {
        val coins = intArrayOf(1, 2, 5)
        val amount = 11
        val expected = 3

        assertEquals(expected, CoinChange.coinChange(coins, amount))
    }

    @Test
    fun test2() {
        val coins = intArrayOf(2)
        val amount = 3
        val expected = -1

        assertEquals(expected, CoinChange.coinChange(coins, amount))
    }

    @Test
    fun test3() {
        val coins = intArrayOf(1)
        val amount = 0
        val expected = 0

        assertEquals(expected, CoinChange.coinChange(coins, amount))
    }
}
