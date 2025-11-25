package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordSquaresTest {
    @Test
    fun test1() {
        val words = arrayOf("area", "lead", "wall", "lady", "ball")
        val expected = listOf(
            listOf("wall", "area", "lead", "lady"),
            listOf("ball", "area", "lead", "lady"),
        )

        assertEquals(expected, WordSquares.wordSquares(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("abat", "baba", "atan", "atal")
        val expected = listOf(
            listOf("baba", "abat", "baba", "atan"),
            listOf("baba", "abat", "baba", "atal"),
        )

        assertEquals(expected, WordSquares.wordSquares(words))
    }

}