package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlipGameTest {
    @Test
    fun test1() {
        val input = "++++"
        val expected = listOf("--++", "+--+", "++--")

        assertEquals(expected, FlipGame.generatePossibleNextMoves(input))
    }

    @Test
    fun test2() {
        val input = "+"
        val expected = emptyList<String>()

        assertEquals(expected, FlipGame.generatePossibleNextMoves(input))
    }
}