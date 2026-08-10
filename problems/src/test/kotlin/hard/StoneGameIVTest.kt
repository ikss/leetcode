package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameIVTest {
    @Test
    fun test1Recursive() {
        val n = 1
        val expected = true

        assertEquals(expected, StoneGameIV.winnerSquareGameRecursive(n))
    }

    @Test
    fun test2Recursive() {
        val n = 2
        val expected = false

        assertEquals(expected, StoneGameIV.winnerSquareGameRecursive(n))
    }

    @Test
    fun test3Recursive() {
        val n = 4
        val expected = true

        assertEquals(expected, StoneGameIV.winnerSquareGameRecursive(n))
    }

    @Test
    fun test1Dp() {
        val n = 1
        val expected = true

        assertEquals(expected, StoneGameIV.winnerSquareGameDp(n))
    }

    @Test
    fun test2Dp() {
        val n = 2
        val expected = false

        assertEquals(expected, StoneGameIV.winnerSquareGameDp(n))
    }

    @Test
    fun test3Dp() {
        val n = 4
        val expected = true

        assertEquals(expected, StoneGameIV.winnerSquareGameDp(n))
    }
}