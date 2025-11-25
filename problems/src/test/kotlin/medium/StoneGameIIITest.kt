package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameIIITest {
    @Test
    fun test1() {
        val values = intArrayOf(1, 2, 3, 7)
        val expected = "Bob"

        assertEquals(expected, StoneGameIII.stoneGameIII(values))
    }

    @Test
    fun test2() {
        val piles = intArrayOf(1, 2, 3, -9)
        val expected = "Alice"

        assertEquals(expected, StoneGameIII.stoneGameIII(piles))
    }

    @Test
    fun test3() {
        val piles = intArrayOf(1, 2, 3, 6)
        val expected = "Tie"

        assertEquals(expected, StoneGameIII.stoneGameIII(piles))
    }
}