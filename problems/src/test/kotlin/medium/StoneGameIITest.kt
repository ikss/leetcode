package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameIITest {
    @Test
    fun test1Recursive() {
        val piles = intArrayOf(2, 7, 9, 4, 4)
        val expected = 10

        assertEquals(expected, StoneGameII.stoneGameIIRecursive(piles))
    }

    @Test
    fun test2Recursive() {
        val piles = intArrayOf(1, 2, 3, 4, 5, 100)
        val expected = 104

        assertEquals(expected, StoneGameII.stoneGameIIRecursive(piles))
    }

    @Test
    fun test1dp() {
        val piles = intArrayOf(2, 7, 9, 4, 4)
        val expected = 10

        assertEquals(expected, StoneGameII.stoneGameIIdp(piles))
    }

    @Test
    fun test2dp() {
        val piles = intArrayOf(1, 2, 3, 4, 5, 100)
        val expected = 104

        assertEquals(expected, StoneGameII.stoneGameIIdp(piles))
    }
}
