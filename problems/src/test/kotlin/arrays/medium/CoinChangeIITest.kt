package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoinChangeIITest {
    @Test
    fun test1backtrack() {
        val amount = 5
        val coins = intArrayOf(1, 2, 5)
        val expected = 4

        assertEquals(expected, CoinChangeII.changeBacktrack(amount, coins))
    }

    @Test
    fun test2backtrack() {
        val amount = 3
        val coins = intArrayOf(2)
        val expected = 0

        assertEquals(expected, CoinChangeII.changeBacktrack(amount, coins))
    }

    @Test
    fun test3backtrack() {
        val amount = 10
        val coins = intArrayOf(10)
        val expected = 1

        assertEquals(expected, CoinChangeII.changeBacktrack(amount, coins))
    }
}