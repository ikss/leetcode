package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlipGameTest {
    @Test
    fun test1() {
        val input = "++++"
        val output = listOf("--++", "+--+", "++--")

        assertEquals(output, FlipGame.generatePossibleNextMoves(input))
    }

    @Test
    fun test2() {
        val input = "+"
        val output = emptyList<String>()

        assertEquals(output, FlipGame.generatePossibleNextMoves(input))
    }
}