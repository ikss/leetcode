package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameTest {
    @Test
    fun test1dp() {
        val piles = intArrayOf(5, 3, 4, 5)
        val expected = true

        assertEquals(expected, StoneGame.stoneGameDp(piles))
    }

    @Test
    fun test2dp() {
        val piles = intArrayOf(3, 7, 2, 3)
        val expected = true

        assertEquals(expected, StoneGame.stoneGameDp(piles))
    }

    @Test
    fun test1math() {
        val piles = intArrayOf(5, 3, 4, 5)
        val expected = true

        assertEquals(expected, StoneGame.stoneGameMath(piles))
    }

    @Test
    fun test2math() {
        val piles = intArrayOf(3, 7, 2, 3)
        val expected = true

        assertEquals(expected, StoneGame.stoneGameMath(piles))
    }
}
