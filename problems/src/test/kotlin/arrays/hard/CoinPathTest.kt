package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoinPathTest {
    @Test
    fun test1() {
        val coins = intArrayOf(1, 2, 4, -1, 2)
        val maxJump = 2
        val expected = listOf(1, 3, 5)

        assertEquals(expected, CoinPath.cheapestJump(coins, maxJump))
    }

    @Test
    fun test2() {
        val coins = intArrayOf(1, 2, 4, -1, 2)
        val maxJump = 1
        val expected = listOf<Int>()

        assertEquals(expected, CoinPath.cheapestJump(coins, maxJump))
    }
}