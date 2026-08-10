package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameIVTest {
    @Test
    fun test1() {
        val n = 1
        val expected = true

        assertEquals(expected, StoneGameIV.winnerSquareGame(n))
    }

    @Test
    fun test2() {
        val n = 2
        val expected = false

        assertEquals(expected, StoneGameIV.winnerSquareGame(n))
    }

    @Test
    fun test3() {
        val n = 4
        val expected = true

        assertEquals(expected, StoneGameIV.winnerSquareGame(n))
    }
}