package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveColoredPiecesIfBothNeighborsAreTheSameColorTest {
    @Test
    fun test1() {
        val colors = "AAABABB"
        val expected = true

        assertEquals(expected, RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors))
    }

    @Test
    fun test2() {
        val colors = "AA"
        val expected = false

        assertEquals(expected, RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors))
    }

    @Test
    fun test3() {
        val colors = "ABBBBBBBAAA"
        val expected = false

        assertEquals(expected, RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors))
    }
}